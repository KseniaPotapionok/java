package by.gsu.pms;

public class BusinessTrip {

	
		
	 private final int RATE = 600;
	 private String account;
	 private int expenses;
	 private int day;
	 
	 public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public int getExpenses() {
		return expenses;
	}
	
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public BusinessTrip(String account, int expenses, int day) {
		super();
		this.account = account;
		this.expenses = expenses;
		this.day = day;
	}
	
	public BusinessTrip() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	public int getTotal(){
		return expenses + RATE*day;
	}
	 
	public void show(){
		System.out.println(
				"rate = " + RATE + 
				"\naccount = " + account +
				"\ntransport = " + expenses +
				"\ndays = " + day +
				"\ntotal = " + getTotal()
				);
	}
	 

	

}
