package vehiclepackage;

public class Vehicle {
private String color;
private int wheels;
private String model;
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String color, int wheels, String model) {
		super();
		this.color = color;
		this.wheels = wheels;
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", wheels=" + wheels + ", model=" + model + "]";
	}

}
