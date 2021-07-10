package com.company.client;

import com.company.exceptions.*;
import com.company.stockllist.*;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class CatalogFileLoader implements CatalogLoader{
    private String fileName;

    public CatalogFileLoader(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void load(ItemCatalog cat) throws CatalogLoadException {
        File f = new File(fileName);
        InputStreamReader fis;
        String line;
        try {
            fis = new InputStreamReader(new FileInputStream(fileName), "Windows-1251");
            Scanner s = new Scanner(fis);

            while(s.hasNextLine()){
                line = s.nextLine();
                if(line.length()==0) break;
                String[] item_fld = line.split(";");
                String name = item_fld[0];
                float price = Float.parseFloat(item_fld[1]);
                short expires = Short.parseShort(item_fld[2]);
                FoodItem item = new FoodItem(name,price,null, new Date(),expires);
                cat.addItem(item);
            }
        } catch (FileNotFoundException | ItemAlreadyExistsException | UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }

}
