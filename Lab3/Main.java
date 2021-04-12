package StockListProject;
//import StockListProject.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    
        System.out.println("--------task3-1---------------\n");
		String line = "Candy 'Mask';sdfsdfs;120";
		String[] item_fld;
		item_fld = line.split(";");
        if (item_fld.length >= 3) {
            try{
		        FoodItem ite = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
            } catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
		ite.printAll();

    }
    
}
