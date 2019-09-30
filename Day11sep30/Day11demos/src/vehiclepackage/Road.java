package vehiclepackage;

public class Road {

	public static void main(String[] args) {
		Truck t=new Truck("yellow",8,"Leyland");
		t.setLoad("sand");
		System.out.println(t);
		Bus b=new Bus("Red",6,"ksrtc");
		b.setType("sleeper");
		System.out.println(b);
		Car c=new Car("Black",4,"Corvette");
		c.setSeats(5);
		System.out.println(c);
	}

}
