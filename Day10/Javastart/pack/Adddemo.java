package pack;
import java.util.*;

public class Adddemo {
	int num=0;
	int sum=0;
	int c=0;
	int ch=0;
	Scanner sc= new Scanner(System.in);
	
	public void display() {
		do {
			System.out.println("Enter your number"+(++c));
			num=sc.nextInt();
			if(num>100) {
				System.out.println("Out");
				break;
			}
			if(num<0) {
				System.out.println("dont enter negative");
				--c;
				ch=1;
			continue;}
			sum=num+sum;
			System.out.println("want to continue enter 1 for yes and anyother for no");
			ch=sc.nextInt();
			
			
		}while(ch==1);
		System.out.println("SUm is"+sum);
		
		
	}
	public static void main(String args[]) {
		Adddemo a=new Adddemo();
		a.display();
	}

}
