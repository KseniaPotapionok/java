import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import by.gsu.pms.Bus;

public class Runner {
	public static void main(String args[]) {
		try (Scanner scanner = new Scanner(new FileReader("src/file.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/new_file.txt"))) {
			List<Bus> list = new ArrayList<>();
			while (scanner.hasNext()) {
				list.add(new Bus(scanner));
			}

			//

			for (Bus liste : list) {
				bw.write(liste + "\n");
				//System.out.println(liste);
			}

			//Runner.printList(list);

			List<Bus> bussesWith17Route = Runner.getBussesWithDefinedRouteNumber(list, 17);
			Runner.printList(bussesWith17Route);

			System.out.println();

			List<Bus> bussesUsed30Years = Runner.getBussesUsedMoreThanYears(list, 30);
			Runner.printList(bussesUsed30Years);

			System.out.println();

			List<Bus> bussesUsed1800Mileage = Runner.getBussesUsedMoreThanDistance(list, 2000);
			Runner.printList(bussesUsed1800Mileage);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

	private static List<Bus> getBussesWithDefinedRouteNumber(List<Bus> busses, int routeNumber) {

		List<Bus> bussesWithRouteNumber = new ArrayList<>();
		for (Bus bus : busses) {
			if (routeNumber == bus.getNumberRoute()) {
				bussesWithRouteNumber.add(bus);
			}
		}
		return bussesWithRouteNumber;
	}

	private static List<Bus> getBussesUsedMoreThanYears(List<Bus> busses, int years) {

		List<Bus> bussesThatUsedMoreThanYears = new ArrayList<>();
		for (Bus bus : busses) {
			if (years < Calendar.getInstance().get(Calendar.YEAR) - bus.getYear()) {
				bussesThatUsedMoreThanYears.add(bus);
			}
		}
		return bussesThatUsedMoreThanYears;
	}

	private static List<Bus> getBussesUsedMoreThanDistance(List<Bus> busses, double distance) {

		List<Bus> bussesThatUsedMoreThanDistance = new ArrayList<>();
		for (Bus bus : busses) {
			if (distance < bus.getMileage()) {
				bussesThatUsedMoreThanDistance.add(bus);
			}
		}
		return bussesThatUsedMoreThanDistance;
	}

	private static void printList(List<Bus> busses) {
		for (Bus bus : busses) {
			System.out.println(bus);
		}
	}
}
