import by.gsu.pms.BusinessTrip;

public class Runner {

	public static void main(String[] args) {

		BusinessTrip[] trips = new BusinessTrip[] {
				new BusinessTrip("Potapionok Ksenia", 10, 10), null,
				new BusinessTrip("Gladchenko Natali", 5, 5),
				new BusinessTrip("Sereda Nicolay", 15, 10),
				new BusinessTrip("Korotkevich Artem", 20, 30),
				new BusinessTrip("Afonina Alina", 10, 10), new BusinessTrip() };

		for (BusinessTrip trip : trips) {
			if (trip != null) {
				trip.show();
			}

		}

		trips[trips.length - 1].setExpenses(30);
		System.out.println("Duration = " + (trips[0].getDay() + trips[1].getDay()));
		
		for (BusinessTrip businessTrip : trips) {
			System.out.println(businessTrip);
		}
		
		int totalSum = 0;
		for(BusinessTrip trip : trips){
			totalSum += trip.getTotal();
		}
		System.out.println(totalSum);

	}
}
