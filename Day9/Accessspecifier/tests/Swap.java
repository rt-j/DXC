package tests;
import java.util.*;

public class Swap {
int a;
int b;
Scanner k=new Scanner(System.in);
public void swap() {
	System.out.println("enter 1st number");
	a=k.nextInt();
	System.out.println("enter 2nd number");
	b=k.nextInt();
	System.out.println("Values before swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Values after swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	
}
public static void main(String args[]) {
	Swap a=new Swap();
	a.swap();
}
}
