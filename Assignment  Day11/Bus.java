package vehiclepackage;

public class Bus extends Vehicle {
private String type;
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String color, int wheels, String model) {
		super(color, wheels, model);
		// TODO Auto-generated constructor stub
	}

	public Bus(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bus [type=" + type + "\tcolor="+getColor()+"\tnumberofwheels="+getWheels()+"\tmodel="+getModel()+"]";
	}

}
