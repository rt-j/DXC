package pack;

public class Constructordemo {
	String customerId = "0";
    String customerName = "Not Available";
	String customerAddress = "Address Not avaiable";
	int billAmount = 100;
	int c=0;
	
	public Constructordemo() {
		
		String customerId = "0";
	    String customerName = "Not Available";
		String customerAddress = "Address Not avaiable";
		int billAmount = 100;
	}
	public Constructordemo(String n,String b,String c,int w) {
		customerId=n;
		customerName=b;
		customerAddress=c;
		billAmount=w;
		}
	public void display() {
		System.out.println("ID is"+customerId);
		System.out.println("name is"+customerName);
		System.out.println("address is"+customerAddress);
		System.out.println("bill is"+billAmount);
	}
	
	
 public static void main(String[] args) {
	Constructordemo c1=new Constructordemo();
	Constructordemo c2=new Constructordemo("1","Raj","rome",23);
	Constructordemo c3=new Constructordemo("2","kumar","bg",900);
	c1.display();
	c2.display();
	c3.display();
}
}
