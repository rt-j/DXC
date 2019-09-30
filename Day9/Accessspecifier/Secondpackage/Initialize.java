package Secondpackage;
import java.util.*;

public class Initialize {
	Scanner sc= new Scanner(System.in);
	int age,num1,num2;
	String name;
	final int i=500;
	
	
	public void display(){
		int j;
		if(i<100)
			j=20;
		System.out.println(i+j);
		
		System.out.println("Enter ur name:");
		name=sc.next();
		System.out.println("Enter ur age:");
		age=sc.nextInt();
		System.out.println("Enter ur 1st num:");
		num1=sc.nextInt();
		System.out.println("Enter ur 2nd num");
		num2=sc.nextInt();/*nextInt we type for converting to int*/
		System.out.println("SUm is"+" "+(num1+num2));
		
		
	}

public static void main(String args[]) {
	Initialize a=new Initialize();
	a.display();
}
}
