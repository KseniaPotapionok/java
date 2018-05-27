package by.gsu.pms;

import java.util.ArrayList;
import java.util.List;

public class CalculatorThread extends Thread {

	long result = 1;
	List<Integer> numbers = new ArrayList<Integer>();

	public CalculatorThread() {
		super("CalculatorThread");
	}

	public void run() {

		for (Integer number : numbers) {
			result *= number;
		}
		this.interrupt();
		//this.stop();
		System.out.println("CT" + this.getState());

	}

	public void addNumber(int number) {
		numbers.add(number);
	}

	public long getResult() {
		return result;
	}

}
