package com.company.client;
import com.company.exceptions.CatalogLoadException;
import com.company.exceptions.ItemAlreadyExistsException;
import com.company.stockllist.*;
import com.company.sync.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException, CatalogLoadException, ItemAlreadyExistsException {
        ItemCatalog cat = new ItemCatalog();

        GenericItem first = new GenericItem();
        GenericItem second = new GenericItem();
        GenericItem third = new GenericItem();
        GenericItem fourth = new GenericItem();
        GenericItem fifth = new GenericItem();
        GenericItem sixth = new GenericItem();
        GenericItem seventh = new GenericItem();
        GenericItem eighth = new GenericItem();
        GenericItem ninth = new GenericItem();
        GenericItem tenth = new GenericItem();


        cat.addItem(first);
        cat.addItem(second);
        cat.addItem(third);
        cat.addItem(fourth);
        cat.addItem(fifth);
        cat.addItem(sixth);
        cat.addItem(seventh);
        cat.addItem(eighth);
        cat.addItem(ninth);
        cat.addItem(tenth);

        long begin = new Date().getTime();

        for(int i=0; i<100000;i++)
            cat.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin)); begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            cat.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

        CatalogLoader loader = new CatalogSubloader();
        try {
            loader.load(cat);
        }
        catch (CatalogLoadException | ItemAlreadyExistsException e){
            e.printStackTrace();
        }
      cat.printItems();


        CatalogFileLoader loader2 = new CatalogFileLoader("items.lst");
        loader2.load(cat);
        cat.printItems();
    }
}
