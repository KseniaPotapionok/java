package by.gsu.pms;

public class Person {

	private String surname;
	private int age;
	private String sex;
	
	
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toString() {
		return surname + ";" + age + ";" + sex;
	}
	
	public Person(String surname, int age, String sex) {
		super();
		this.surname = surname;
		this.age = age;
		this.sex = sex;
	}
	
	public Person() {
		super();
		
	}
	
	/*public  int getCost(){
		return age*;
	}*/
	
	
	
}
