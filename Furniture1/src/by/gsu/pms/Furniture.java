package by.gsu.pms;

public class  Furniture {

	
	private String manufacturer;
	private double price;
	private String material;
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public Furniture(String manufacturer, double price, String material){
		
		super();
		this.manufacturer = manufacturer;
		this.material = material;
		this.price = price;
		
	}
	
	public Furniture(String manufacturer, String material, double price){
		
		this.manufacturer = manufacturer;
		this.material = material;
	}
	
	public Furniture(){
	}

	protected String fieldsToString() {
		return manufacturer + ";" + price + ";" + material;
	}
	protected String writeInfo() {
		return "Furniture:";
	}
	@Override
	public String toString() {
		return writeInfo()+fieldsToString();
	}
	
}
