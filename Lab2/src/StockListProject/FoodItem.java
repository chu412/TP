package StockListProject;
import java.util.*;

public class FoodItem extends GenericItem {
    private Date dateOfIncome = new Date();
    private short expires;


    public FoodItem(int ID, String name, float price, Category type, Date date, short exp) {
        super(ID, name, price, Category.FOOD);
        dateOfIncome = date;
        expires = exp;
    }   

    public Date getDate() {
        return dateOfIncome;
    }

    public void setDate(Date date) {
        dateOfIncome = date;
    }

    public short getExp() {
        return expires;
    }
    void printAll(){
        System.out.printf("ID: %d,\tName: %-20s,\tprice: %5.2f,\ttype: %s,\texpires:%d \n", ID, name, price, type, expires);
        }
}
