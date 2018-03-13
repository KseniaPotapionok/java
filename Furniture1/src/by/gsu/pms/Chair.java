package by.gsu.pms;

public class Chair extends Furniture{

	private boolean regulate;

	
	public Chair() {
		super();
		
	}
	
	public Chair(String manufacturer, double price, String material,
			boolean regulate) {
		super(manufacturer, price, material);
		this.regulate = regulate;
	}
	
	public Chair(String manufacturer, double price, String material) {
		super(manufacturer, price, material);
		
	}
	
	public boolean isRegulate() {
		return regulate;
	}

	public void setRegulate(boolean regulate) {
		this.regulate = regulate;
	}

	protected String fieldsToString() {
		return super.fieldsToString()+';'+regulate;
	}

	protected String writeInfo() {
		return "Chair:";
	}
	@Override
	public String toString() {
		return writeInfo()+fieldsToString();
	}
}
