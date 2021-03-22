package StockListProject;
//import java.util.Date;

public class GenericItem {

    public int ID;
 	public String name;
 	public float price;
    public Category type;

    public GenericItem(int ID, String name, float price){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.type = Category.GENERAL;
    }

    public GenericItem(int ID, String name, float price, Category type){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.type = type;

    }
    public GenericItem() {
    }


 	void printAll(){
    System.out.printf("ID: %d,\tName: %-20s,\tprice: %5.2f,\ttype: %s \n", ID, name, price, type);
    }

}
