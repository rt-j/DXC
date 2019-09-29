package assignmentPackage;

import java.util.*;

public class DisplayDetails {
	Scanner sc= new Scanner(System.in);
	int productId;
	String productName="";
	int quantity;
	int price;
	boolean f,h,j;
	public void getData() {
	System.out.println("Enter your product ID");
		productId=sc.nextInt();
		System.out.println("Enter your product Name");
		productName=sc.next();
		System.out.println("Enter the quantity");
		quantity=sc.nextInt();
		System.out.println("Enter your price");
		price=sc.nextInt();
		while((f=productId<0) || (h=quantity<0)||(j=price<0)) {
			if(f==true) {
				System.out.println("Re-enter product id with positive digits");
				productId=sc.nextInt();
			}
			else if(h==true) {
				System.out.println("Re-enter quantity with positive values");
				quantity=sc.nextInt();
			}
			else {
				System.out.println("Re-enter price");
				price=sc.nextInt();
			}
		}
		}
	public String toString() {
		return "DisplayDetails [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	

}
