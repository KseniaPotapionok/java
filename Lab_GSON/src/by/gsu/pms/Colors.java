package by.gsu.pms;

public class Colors {
	
	private String color;
	private String category;
	private String type;
	private String code;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Colors(String color, String category, String type, String code) {
		super();
		this.color = color;
		this.category = category;
		this.type = type;
		this.code = code;
	}
	public Colors() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Colors [color=" + color + ", category=" + category + ", type=" + type + ", code=" + code + "]";
	}
	
	

}
