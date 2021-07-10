package com.company.client;

import com.company.exceptions.CatalogLoadException;
import com.company.exceptions.ItemAlreadyExistsException;
import com.company.stockllist.Category;
import com.company.stockllist.FoodItem;
import com.company.stockllist.GenericItem;
import com.company.stockllist.ItemCatalog;

import java.util.Date;

public class CatalogSubloader implements CatalogLoader {

    @Override
    public void load(ItemCatalog cat) throws CatalogLoadException, ItemAlreadyExistsException {
            GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
            FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
            try {
                cat.addItem(item1);
                cat.addItem(item2);
            }
            catch (ItemAlreadyExistsException e) {
                e.printStackTrace();
                throw new CatalogLoadException(e);
            }
        }
    }
