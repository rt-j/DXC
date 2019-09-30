package vehiclepackage;

public class Truck extends Vehicle {
    private String load;
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String color, int wheels, String model) {
		super(color, wheels, model);
		// TODO Auto-generated constructor stub
	}

	public Truck(String load) {
		super();
		this.load = load;
	}

	public String getLoad() {
		return load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	@Override
	public String toString() {
		return "Truck [load=" + load + "\tcolor="+getColor()+"\tnumberofwheels="+getWheels()+"\tmodel="+getModel()+"]";
	}

}
