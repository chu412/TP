package StockListProject;
//import java.util.Date;

public class GenericItem {

    public int ID;// ID товара
	public String name;// Наименование товара
	public float price;// Цена товара
	public String placeOfProduction;
	public Category category = Category.GENERAL;
	static int currentID=0;

	public GenericItem() {
		this.ID = GenericItem.currentID++;
	}

	public GenericItem(String name, float price, GenericItem analog) {
		this.name = name;
		this.price = price;
		this.category = analog.category;
		this.ID = GenericItem.currentID++;

	}

	public GenericItem(String name, float price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.ID = GenericItem.currentID++;
	}

	void printAll() {
		System.out.printf("ID: %d , Name: %-20s , price:%5.2f ,Category: %s ,Made in %s\n", ID, name, price, category,
				placeOfProduction);
	}

	/*public int hashCode() {
		int hash = 17;
		hash += this.name.hashCode();
		hash = hash * 31 + this.ID;
		hash += (hash << 10);
		hash ^= (hash >> 6);
		return hash;
	}*/

    public String toString() {
		return super.toString();
	}

}
