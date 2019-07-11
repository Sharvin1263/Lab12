
public class UsedCar extends Car {

	protected double mileage;

	public UsedCar() {

	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "UsedCar [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", mileage="
				+ mileage + "]";
	}

}
