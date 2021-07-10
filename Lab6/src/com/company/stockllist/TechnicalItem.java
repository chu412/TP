package com.company.stockllist;

public class TechnicalItem extends GenericItem{
    public short WarrantyTime = 365;

    public TechnicalItem(int id, String name, float price, short warranty) {
        //super(id, name, price);
        setId(id);
        setName(name);
        setPrice(price);
        WarrantyTime = warranty;
    }

    @Override
    public void PrintAll() {
        System.out.printf("Id: %d, Name: %-20s, Price: %5.2f, Category: %s, Warrantay time: %d \n", this.getId(), this.getName(), this.getPrice(), this.getType(), WarrantyTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() == o.getClass()) {
            if (this == o) {
                return true;
            }
            TechnicalItem g = (TechnicalItem) o;

            return this.getId() == g.getId() && this.getName().equals(g.getName()) && this.getPrice() == g.getPrice() && this.WarrantyTime == g.WarrantyTime;
        }

    return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public short getWarrantyTime() {
        return WarrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        WarrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Id: " +  this.getId() + ", Price: " + this.getPrice() + ", Warranty time: " + this.WarrantyTime;
    }
}
