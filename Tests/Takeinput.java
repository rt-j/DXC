package Secondpackage;
import java.util.*;

public class Takeinput {
	Scanner sc= new Scanner(System.in);
	int num1,num2;
	public void display() {
		System.out.println("Enter ur 1st num:");
		num1=sc.nextInt();
		System.out.println("Enter ur 2nd num");
		num2=sc.nextInt();/*nextInt we type for converting to int*/
		
		if(num1<0 || num2<0) {
			System.out.println("Enter only positive number");}
		else {
		System.out.println("SUm is"+" "+(num1+num2));}
		}

public static void main(String args[]) {
	Takeinput a=new Takeinput();
	a.display();
}
}
