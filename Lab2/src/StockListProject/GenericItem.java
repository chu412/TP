package StockListProject;
//import java.util.Date;

public class GenericItem {

    public int ID;
 	public String name;
 	public float price;
    public Category type = Category.GENERAL;

    public GenericItem(int ID, String name, float price){
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public GenericItem(int ID, String name, float price, Category type){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.type = type;

    }
    public GenericItem() {
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public Category getType() {
        return type;
    }
 	void printAll(){
    System.out.printf("ID: %d,\tName: %-20s,\tprice: %5.2f,\ttype: %s \n", ID, name, price, type);
    }

}
