package StockListProject;
import java.util.*;

public class ItemCatalog {
    private Map<Integer, GenericItem> catalog;
    private List<GenericItem> alCatalog;

    public Map<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }

    public List<GenericItem> getALCatalog() {
        return alCatalog;
    }

    public void setalCatalog(ArrayList<GenericItem> alCatalog) {
        this.alCatalog = alCatalog;
    }

    public void addItem(GenericItem item) {
        int id = item.getID();
        catalog.put(id, item);
        alCatalog.add(item);
    }

    public void printItems() {
        for (GenericItem i : alCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : alCatalog) {
            int getId = i.getID();
            if (getId == id) {
                return i;
            }
        }
        return null;
    }
    
}
