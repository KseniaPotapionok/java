package by.gsu.pms;

public class Runner {

	public static void main(String... args) {

		ThreadGenerator tg = new ThreadGenerator();
		tg.enterThreadAmount();
		tg.enterA();

		tg.devideDataToThreads();
		tg.execute();

		//		while (!tg.isAllTerminated()) {
		//			try {
		//				Thread.sleep(500);
		//			} catch (InterruptedException e) {
		//				e.printStackTrace();
		//			}
		//		}

		System.out.println(tg.getResult());

	}

}
