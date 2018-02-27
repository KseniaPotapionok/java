package by.gsu.pms;


public class Purchase implements Comparable<Purchase> {
	
	public static final  String NAME_PURCHASE = "Bread";
	public static final int PRICE = 145;
	private  int unitsNumber;
	private WeekDays days;
	public int getUnitsNumber() {
		return unitsNumber;
	}
	public void setUnitsNumber(int unitsNumber) {
		this.unitsNumber = unitsNumber;
	}
	public WeekDays getDays() {
		return days;
	}
	public void setDays(WeekDays days) {
		this.days = days;
	}
	
	public Purchase(int unitsNumber, WeekDays days) {
		super();
		this.unitsNumber = unitsNumber;
		this.days = days;
	}

	
	public int getCost(){
		return PRICE*unitsNumber;
	}
	
	@Override
	public int compareTo(Purchase that) {
		return (this.getCost() - that.getCost());
	}
	
	/*public void show(){
		System.out.println(
				"NAME_PURCHASE = " + NAME + 
				"\nPRICE = " + price +
				"\nunitsNumber = " + number +
				"\ndays = " + day 
				);
	}*/
	
	@Override
	public String toString() {
		return NAME_PURCHASE+";"+PRICE+";"+unitsNumber+";"+days;
	}
	
	
	

}
