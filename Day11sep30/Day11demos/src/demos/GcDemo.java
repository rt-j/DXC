package demos;

public class GcDemo {
	int salary;
	public void finalize() {
		System.out.println("Garbage collection called");
	}
	
	public static void main(String[] args) {
		GcDemo g1=new GcDemo();
		System.out.println("gc object created");
		g1.salary=600;
		GcDemo g2=new GcDemo();
		g1=g2;
		System.out.println(g1.salary);
		System.gc();
		}

}
