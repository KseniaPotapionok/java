package by.gsu.pms;

public class Currency {
	
	private int currencyId;
	private int numCode;
	private String charCode;
	private int scale;
	private String name;
	private double rate;
	
	
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	public int getNumCode() {
		return numCode;
	}
	public void setNumCode(int numCode) {
		this.numCode = numCode;
	}
	public String getCharCode() {
		return charCode;
	}
	public void setCharCode(String charCode) {
		this.charCode = charCode;
	}
	public int getScale() {
		return scale;
	}
	public void setScale(int scale) {
		this.scale = scale;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Currency(int currencyId, int numCode, String charCode, int scale, String name, double rate) {
		super();
		this.currencyId = currencyId;
		this.numCode = numCode;
		this.charCode = charCode;
		this.scale = scale;
		this.name = name;
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "CurrencyId=" + currencyId + ";" + "numCode=" + numCode + ";" + "charCode=" + charCode + ";" + "scale="
				+ scale + ";" + "name=" + name + ";" + "rate=" + rate;
	}
	
	
	
	
	 
	
	
	
	

}
