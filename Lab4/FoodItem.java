package StockListProject;
import java.util.*;

public class FoodItem extends GenericItem {
    private Date dateOfIncome = new Date();
	private short expires;
	

	public FoodItem(String name, float price, Date date, short expires) {
		super(name, price, Category.FOOD);
		this.expires = expires;
		this.dateOfIncome = date;
	}

	public FoodItem(String name, float price, short expires) {
		this(name, price, new Date(), expires);
	}
    
	public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
		this(name, price, expires);
		this.dateOfIncome = date;
	}
	
	public Date getDateOfIncome() {
		return dateOfIncome;
	}

	public void setDateOfIncome(Date dateOfIncome) {
		this.dateOfIncome = dateOfIncome;
	}

	public short getExpires() {
		return expires;
	}

	public void setExpires(short expires) {
		this.expires = expires;
	}


	@Override
	void printAll() {
		super.printAll();
		System.out.printf("date of income:%s,expires:%d days \n", dateOfIncome.toString(), expires);
	}

    public String toString() {
		return super.toString();
	}


}
