package com.company.stockllist;

import java.util.Objects;

public class GenericItem implements Cloneable {
    private int Id;

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public Category getType() {
        return Type;
    }

    public void setType(Category type) {
        Type = type;
    }

    public GenericItem getAnalog() {
        return Analog;
    }

    public void setAnalog(GenericItem analog) {
        Analog = analog;
    }

    public static int getCurrentId() {
        return CurrentId;
    }

    public static void setCurrentId(int currentId) {
        CurrentId = currentId;
    }

    private String Name;
    private float Price;
    private Category Type;
    private GenericItem Analog;
    private static int CurrentId = 0;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public GenericItem(String name, float price, Category category) {
        Name = name;
        Price = price;
        Type = category;
        this.Id = GenericItem.CurrentId++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this(name, price, (Category) null);
        Analog = analog;
        this.Id = GenericItem.CurrentId++;
    }

    public GenericItem() {
        this(null, 0, (Category) null);
        this.Id = GenericItem.CurrentId++;
    }

    public void PrintAll() {
        System.out.printf("Id: %d, Name: %-20s, Price: %5.2f, Category: %s \n", Id, Name, Price, Type);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem that = (GenericItem) o;
        return Id == that.Id && Float.compare(that.Price, Price) == 0 && Objects.equals(Name, that.Name) && Type == that.Type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, Price, Type);
    }

    @Override
   protected Object clone() throws CloneNotSupportedException {
        return super.clone();
       // return new GenericItem(this.Id, this.Name, this.Price);
    }

    @Override
    public String toString() {
        return "Name: " + this.Name + ", Id: " +  Id + ", Price: " + this.Price;
    }
}
