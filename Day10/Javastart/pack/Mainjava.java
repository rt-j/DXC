package pack;

public class Mainjava {
public static void main(String[] args) {
	ConstructorCalling c=new ConstructorCalling("rt","tr",23);
	c.displayCusInfo();
	c.setBill(250000);
	Product p=new Product(2,"rt",4,5);
	System.out.println(p);
	
}
}
