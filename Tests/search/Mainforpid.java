package assignmentPackage;
import java.util.*;


public class Mainforpid {
	static String n;
	static Scanner s=new Scanner(System.in);
	static boolean value;
	static int c;
	
	public static void main(String[] args) {
		
		System.out.println("Enter the pid");
		n=s.next();
		ProductId p[]=new ProductId[3];
		for (int i = 0; i < p.length; i++) {
			p[i] = new ProductId();
		}
		p[0]=new ProductId("100","KTM",10);
		p[1]=new ProductId("101","RE",11);
		p[2]=new ProductId("102","Bajaj",130);
		
		for (int i = 0; i < p.length; i++) {
			value=p[i].check(n);
			
			if(value==true) {
				
				System.out.println(p[i].toString());
				break;
				}
			else
				c++;
			if(c==3)
				System.out.println("wrong id");
		}
	}

}
