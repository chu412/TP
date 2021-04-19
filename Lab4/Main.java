package StockListProject;
import java.security.SecureRandom;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ypra 4-1
        ItemCatalog ic=new ItemCatalog();
		ic.addItem(new GenericItem("pen1",1234,Category.GENERAL));
		ic.addItem(new GenericItem("pen2",1123.643f,Category.GENERAL));
		ic.addItem(new GenericItem("pen3",179,Category.GENERAL));
		ic.addItem(new GenericItem("pen4",1876,Category.GENERAL));
		ic.addItem(new GenericItem("pen5",1657,Category.GENERAL));
		ic.addItem(new GenericItem("pen6",176,Category.GENERAL));
		ic.addItem(new GenericItem("pen7",134,Category.GENERAL));
		ic.addItem(new GenericItem("pen8",1345,Category.GENERAL));
		ic.addItem(new GenericItem("pen9",102,Category.GENERAL));
		ic.addItem(new GenericItem("pen10",134,Category.GENERAL));
		
		/*long begin = new Date().getTime(); 
		for(int i=0; i<10000000;i++) 
		ic.findItemByID(9); 
		long end = new Date().getTime(); 
		System.out.println("In HashMap: "+(end-begin)); begin = new Date().getTime(); 
		for(int i=0; i<10000000;i++) 
			ic.findItemByIDAL(9); 
		end = new Date().getTime(); 
		System.out.println("In ArrayList: "+(end-begin)); */

        // ypra 4-2
        CatalogLoader loader = new CatalogStubLoader(); 
		loader.load(ic); 
		ic.printItems();
    }
    
}
