package StockListProject;

public class TechnicalItem extends GenericItem {

    private short warrantyTime;

    public TechnicalItem(String name, float price, Category type, short war) {
        super(name, price, type);
        warrantyTime = war;
    }

    public short getWarranty() {
        return warrantyTime;
    }

    public void setWarranty(short warranty) {
        warrantyTime = warranty;
    }


    public String toString() {
		return super.toString();
	}

    @Override
	void printAll() {
		super.printAll();
		System.out.printf("warrantyTime: %d \n", warrantyTime);
	}
}
