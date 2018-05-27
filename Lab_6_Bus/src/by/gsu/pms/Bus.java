package by.gsu.pms;

import java.util.Scanner;

public class Bus implements Comparable<Bus> {
	private String surName;
	private String name;
	private int numberBus;
	private int numberRoute;
	private String mark;
	private int year;
	private double mileage;

	public Bus() {

	}

	public Bus(Scanner scanner) {
		this(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.next(), scanner.nextInt(),
				scanner.nextDouble());
	}

	public Bus(String surName, String name, int numberBus, int numberRoute, String mark, int year, double mileage) {
		this.surName = surName;
		this.name = name;
		this.numberBus = numberBus;
		this.numberRoute = numberRoute;
		this.mark = mark;
		this.year = year;
		this.mileage = mileage;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberBus() {
		return numberBus;
	}

	public void setNumberBus(int numberBus) {
		this.numberBus = numberBus;
	}

	public int getNumberRoute() {
		return numberRoute;
	}

	public void setNumberRoute(int numberRoute) {
		this.numberRoute = numberRoute;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public int compareTo(Bus o) {
		return surName.compareTo(o.surName);
	}

	@Override
	public String toString() {
		return surName + " ; " + name + " ; " + numberBus + " ; " + numberRoute + " ; " + mark + " ; " + year + " ; "
				+ mileage;
	}
}
