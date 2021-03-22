package StockListProject;

public class TechnicalItem extends GenericItem {

    private short warrantyTime;
    
    public TechnicalItem(int ID, String name, float price, Category type, short war) {
        super(ID, name, price, Category.GENERAL);
        warrantyTime = war;
    }

    public short getWarranty() {
        return warrantyTime;
    }

    public void setWarranty(short warranty) {
        warrantyTime = warranty;
    }
    void printAll(){
        System.out.printf("ID: %d,\tName: %-20s,\tprice: %5.2f,\ttype: %s, \twarrantyTime: %d \n", ID, name, price, type, warrantyTime);
        }
}
