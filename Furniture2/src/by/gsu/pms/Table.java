package by.gsu.pms;

public class Table extends Furniture {

	
	private int boxes;
	private double area;
	
	
	public Table() {
		super();
		this.area = 0;
		this.boxes = 0;
	}
	
	public Table(String manufacturer, double price, String material,
			int boxes, double area) {
		super(manufacturer, price, material);
		this.area = area;
		this.boxes = boxes;
	}
	
	public Table(String manufacturer, double price, String material) {
		super(manufacturer, price, material);
		this.area = 0;
		this.boxes = 0;
	}
	
	public int getBoxes() {
		return boxes;
	}
	public void setBoxes(int boxes) {
		this.boxes = boxes;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}


	protected String fieldsToString() {
		return super.fieldsToString()+';'+ area + ";" + boxes;
	}

	@Override
	public void Write() {
		System.out.println("Table:"+fieldsToString());
	}
}
