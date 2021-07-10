package com.company.stockllist;

import com.company.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private final HashMap<Integer, GenericItem> catalog =
            new HashMap<Integer, GenericItem>();
    private final ArrayList<GenericItem> ALCatalog =
            new ArrayList<GenericItem>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {
        for (GenericItem i : ALCatalog) {
            if (i.getId() == (item.getId()))
                throw new ItemAlreadyExistsException(item.getId() + " already exist");
        }
        catalog.put(item.getId(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList

    }

    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
//Если нет такого ID, возвращаем пустое значение
        return catalog.getOrDefault(id, null);
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getId() == id)
                return i;
        }
        return null;
    }
}