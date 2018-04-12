package by.gsu.pms;
import java.io.Serializable;


public class Person implements Serializable {

	
	private static final long serialVersionUID = 1L;
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
	
	
	
	
	
}
