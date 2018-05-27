package by.gsu.pms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadGenerator {

	private int a;
	private int threadAmount;

	List<CalculatorThread> threads;

	public void enterThreadAmount() {

		Scanner in = new Scanner(System.in);
		threadAmount = in.nextInt();
		threads = new ArrayList<>();
		for (int i = 0; i < threadAmount; i++) {
			threads.add(new CalculatorThread());
		}
	}

	public void devideDataToThreads() {

		for (int n = 0, m = 2; m <= a; m += 2) {
			threads.get(n++).addNumber(m);
			if (n == threadAmount) {
				n = 0;
			}
		}
	}

	public void execute() {
		for (int i = 0; i < threadAmount; i++) {
			threads.get(i).start();
		}
	}

	public long getResult() {
		long totalResult = 1;
		for (int i = 0; i < threadAmount; i++) {
			totalResult *= threads.get(i).getResult();
		}
		return totalResult;

	}

	public void enterA() {

		Scanner in = new Scanner(System.in);
		a = in.nextInt();
	}

	@Override
	public String toString() {
		return "ThreadGenerator [a=" + a + ", threadAmount=" + threadAmount + "]";
	}

	//	public boolean isAllTerminated() {
	//		boolean isAllTerminated = true;
	//		System.out.println("is term begin " + isAllTerminated);
	//		for (int i = 0; i < threadAmount; i++) {
	//			System.out.println(threads.get(i).isInterrupted());
	//
	//			if (!threads.get(i).getState().equals("TERMINATED")) {
	//				System.out.println("123");
	//				isAllTerminated = false;
	//			}
	//		}
	//		System.out.println("is term end " + isAllTerminated);
	//		return isAllTerminated;
	//	}

}
