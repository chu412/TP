package StockListProject;
import java.util.*;

public class FoodItem extends GenericItem {
    public Date dateOfIncome = new Date();
	public short expires;
	

	public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
		this(name, price, expires);
		this.dateOfIncome = date;
	}

	public FoodItem(String name, float price, short expires) {
		this(name);
		this.price = price;
		this.expires = expires;
	}

	public FoodItem(String name) {
		this.name=name;
	}

	@Override
	void printAll() {
		super.printAll();
		System.out.printf("date of income:%s,expires:%d days \n", dateOfIncome.toString(), expires);
	}

    public String toString() {
		return super.toString();
	}

	/*public int hashCode() {
		int hash = 17;
		hash += this.name.hashCode();
		hash = hash * 31 + this.ID;
		hash += (hash << 10);
		hash ^= (hash >> 6);
		return hash;
	}*/
}
