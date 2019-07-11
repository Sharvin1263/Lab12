import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<>();

		cars.add(new Car("Cadillac", "Escalade", 2019, 59999.95));
		cars.add(new Car("Chevrolet", "Malibu", 2019, 30599.50));
		cars.add(new UsedCar("Cadillac", "Escalade", 2019, 30000, 25000));
		cars.add(new UsedCar("Ponticac", "Grand Prix", 2004, 10000, 100000));
		cars.add(new Car("Volvo", "XC90", 2019, 39995.90));
		cars.add(new Car("Buick", "Enclave", 2019, 40000.50));
		cars.add(new UsedCar("Honda", "Civic", 2000, 12000, 125000));
		cars.add(new UsedCar("Ford", "Escape", 2012, 15999.95, 95000));
		cars.add(new UsedCar("Nissan", "Sentra", 2005, 7000, 100000));
		cars.add(new Car("Cadillac", "CT6", 2019, 65995.95));

		boolean valid = false;
		do {
			System.out.println();
			for (int i = 0; i < cars.size(); i++) {

				if (cars.get(i) instanceof UsedCar) {

					System.out.printf((i + 1) + ".  %-10s %-10s %-10d $%,-10.2f  (Used) %,-10.2f miles",
							cars.get(i).getMake(), cars.get(i).getModel(), cars.get(i).getYear(),
							cars.get(i).getPrice(), ((UsedCar) cars.get(i)).getMileage());
					System.out.println();

				} else {
					System.out.printf((i + 1) + ".  %-10s %-10s %-10d $%,-10.2f", cars.get(i).getMake(),
							cars.get(i).getModel(), cars.get(i).getYear(), cars.get(i).getPrice());
					System.out.println();
				}
			}

			System.out.print("\n Which car would you like? Enter a number (1-10) or 0 to quit: \n");

			int userInput = scnr.nextInt();
			int j = userInput - 1;

			if (userInput == 0) {
				System.out.println("Have a great day!");
				break;
			}

			else if (cars.get(j) instanceof UsedCar) {

				System.out.printf((userInput) + ".  %-10s %-10s %-10d $%,-10.2f  (Used) %,-10.2f miles",
						cars.get(j).getMake(), cars.get(j).getModel(), cars.get(j).getYear(), cars.get(j).getPrice(),
						((UsedCar) cars.get(userInput - 1)).getMileage());

				System.out.println();

			} else {

				System.out.printf((userInput) + ".  %-10s %-10s %-10d $%,-10.2f", cars.get(j).getMake(),
						cars.get(j).getModel(), cars.get(j).getYear(), cars.get(j).getPrice());

				System.out.println();
			}

			scnr.nextLine();

			System.out.print("\nWould you like to buy this car? (y/n)");
			String userInput2 = scnr.nextLine();

			if (userInput2.equalsIgnoreCase("y")) {
				System.out.println("Excellent! Our finance department will be in touch shortly.\n");

				cars.remove(userInput - 1);

			} else if (userInput2.equalsIgnoreCase("n")) {

				continue;

			} else {
				System.out.println("Invalid input. ");
				continue;

			}

		} while (!valid);
		scnr.close();
	}
}
