package by.gsu.pms;

public class Runner {

	public static void main(String[] args) {
		Purchase[] days = new Purchase[] {
				new Purchase(10, WeekDays.MONDAY),
				new Purchase( 5, WeekDays.TUESDAY),
				new Purchase( 15, WeekDays.WEDNESDAY),
				new Purchase( 20, WeekDays.THURSDAY),
				new Purchase( 10, WeekDays.FRIDAY)
				
				};

			for(int i=0; i<days.length;i++){
				System.out.println(days);
			}
	}

}
