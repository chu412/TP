package StockListProject;
//import StockListProject.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //---------Excercise11-----------
        GenericItem a = new GenericItem(1, "Sony", 100);
        GenericItem b = new GenericItem(2, "SamSung", 200);
        GenericItem c = new GenericItem(3, "Apple", 300);
        System.out.println("Exercise 11:");
        a.printAll();
        b.printAll();
        c.printAll();

         //---------Excercise12-----------
         GenericItem d = new GenericItem(4, "Dell", 1000, Category.GENERAL);
         GenericItem e = new GenericItem(5, "HM", 70, Category.DRESS);
         System.out.println("Exercise 12:");
         d.printAll();
         e.printAll();
        
         //---------Excercise21-----------
        FoodItem food1 = new FoodItem(10, "Bread", 10, Category.FOOD, new Date(), (short) 10);
        FoodItem food2 = new FoodItem(11, "Milk", 50, Category.FOOD, new Date(), (short) 12);
        TechnicalItem tech = new TechnicalItem(11, "TV", 1000, Category.GENERAL, (short) 24);
            
        System.out.println("Array foodiItem and technicalIteam:");
        GenericItem[] test = new GenericItem[5];
        test[0] = food1;
        test[1] = tech;
        test[2] = food2;
        for (GenericItem index: test)
        {
            index.printAll();
        }

    }
    
}
