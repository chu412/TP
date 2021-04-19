package StockListProject;
//import java.util.Date;

public class GenericItem {

    private int ID;// ID товара
	private String name;// Наименование товара
	private float price;// Цена товара
	private String placeOfProduction;
	private Category category = Category.GENERAL;
	private GenericItem analog;
	static int currentID=0;

	public GenericItem(String name, float price, GenericItem analog) {
		this(name, price, Category.GENERAL);
		this.analog = analog;

	}

	public GenericItem() {
		this(null, 0, Category.GENERAL);
	}

	public GenericItem(String name, float price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.ID = GenericItem.currentID++;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPlaceOfProduction() {
		return placeOfProduction;
	}

	public void setPlaceOfProduction(String placeOfProduction) {
		this.placeOfProduction = placeOfProduction;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	void printAll() {
		System.out.printf("ID: %d , Name: %-20s , price:%5.2f ,Category: %s ,Made in %s\n", ID, name, price, category,
				placeOfProduction);
	}

    public String toString() {
		return super.toString();
	}

}
