package com.company.stockllist;

import java.util.Date;

public class FoodItem extends GenericItem{
    private Date DateOfIncome = new Date();
    private short Expires = 2;

    public Date getDateOfIncome() {
        return DateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        DateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return Expires;
    }

    public void setExpires(short expires) {
        Expires = expires;
    }

    @Override
    public FoodItem getAnalog() {
        return Analog;
    }

    public void setAnalog(FoodItem analog) {
        Analog = analog;
    }

    @Override
    public Category getType() {
        return Type;
    }

    @Override
    public void setType(Category type) {
        Type = type;
    }

    private FoodItem Analog;
    Category Type = Category.FOOD;

    /*public FoodItem(int id, String name, float price, short expires ) {
        super(id, name, price);
        Id = id;
        Name = name;
        Price = price;
        Expires = expires;
    }*/

    public FoodItem(String name, float price, FoodItem analog, Date date, short exp) {
        super(name, price, analog);
        DateOfIncome = date;
        Expires = exp;
    }

    public FoodItem(String name, float price, short exp) {
        this(name, price, null, null, exp);
    }

    public FoodItem(String name) {
        this(name, 0, null, null, (short) 0);
    }

    @Override
    public void PrintAll() {
        System.out.printf("Id: %d, Name: %-20s, Price: %5.2f, Category: %s, " +
                " Expires: %d, " + "Date of income: %tT%n", this.getId(), this.getName(), this.getPrice(), Type, Expires, DateOfIncome);
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass()) {
            if (this == o) {
                return true;
            }
            FoodItem g = (FoodItem) o;
            return this.getId() == g.getId() && this.getName().equals(g.getName()) && this.getPrice() == g.getPrice() && this.Expires == g.Expires
                    && this.DateOfIncome == g.DateOfIncome;
        }
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Id: " +  this.getId() + ", Price: " + this.getPrice() + ", Date of income: "
                +this.DateOfIncome.toString() + ", Expires: " + this.Expires + " days";
    }

}
