package vehiclepackage;

public class Car extends Vehicle {
int seats;
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String color, int wheels, String model) {
		super(color, wheels, model);
		// TODO Auto-generated constructor stub
	}

	public Car(int seats) {
		super();
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Car [seats=" + seats + "\tcolor="+getColor()+"\tnumberofwheels="+getWheels()+"\tmodel="+getModel()+"]";
	}

}
