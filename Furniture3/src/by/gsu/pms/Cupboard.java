package by.gsu.pms;

public class Cupboard extends Furniture {

	
	private double width;
	private double depth;
	private double height;
	
	
	
	public Cupboard() {
		super();
		this.depth = 0;
		this.height =0;
		this.width = 0;
	}
	
	public Cupboard(String manufacturer, double price, String material,
			double width, double depth, double height) {
		super(manufacturer, price, material);
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	public Cupboard(String manufacturer, double price, String material) {
		super(manufacturer, price, material);
		this.depth = 0;
		this.height = 0;
		this.width = 0;
	}

	
	


	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}


	protected String fieldsToString() {
		return super.fieldsToString()+';'+ width + ";" + depth + ";" + height;
	}

	@Override
	public void Write() {
		System.out.println("Cupboard:"+fieldsToString());
	}
	
}
