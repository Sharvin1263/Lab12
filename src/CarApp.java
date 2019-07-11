import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering");

		int carInput = scnr.nextInt();
		ArrayList<Car> cars = new ArrayList<>();

		scnr.nextLine();

		for (int i = 0; i < carInput; i++) {

			System.out.println("Enter Car#" + (i + 1) + "Make:");
			String make = scnr.nextLine();

			System.out.println("Enter Car#" + (i + 1) + "Model:");
			String model = scnr.nextLine();

			System.out.println("Enter Car#" + (i + 1) + "Year:");
			int year = scnr.nextInt();

			System.out.println("Enter Car#" + (i + 1) + "Price:");
			double price = scnr.nextDouble();

			cars.add(new Car(make, model, year, price));

			scnr.nextLine();
		}

		System.out.println("Current Inventory:");
		System.out.println("==================\n");

		for (int i = 0; i < cars.size(); i++) {
			System.out.printf("%-10s %-10s %-10d %, -10.2f", cars.get(i).getMake(), cars.get(i).getModel(),
					cars.get(i).getYear(), cars.get(i).getPrice());
			System.out.println();
		}

	}

}
