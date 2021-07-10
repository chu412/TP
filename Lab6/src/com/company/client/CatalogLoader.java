package com.company.client;

import com.company.exceptions.CatalogLoadException;
import com.company.exceptions.ItemAlreadyExistsException;
import com.company.stockllist.ItemCatalog;

public interface CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException, ItemAlreadyExistsException;
}
