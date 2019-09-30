package tests;
import java.util.*;
public class Leap {
	Scanner sc=new Scanner(System.in);
	public void year(){
		int year=0;
		int f=0;
		int h=0;
		System.out.println("Enter the year:");
		year=sc.nextInt();
		if(year<=400) {
			f=(year%4==0)?1:0;
		}
		else if(year>400){
		h=(year%400==0)?1:0;
		}
		else {
			f=0;
			h=0;
		}
		
	if(f==1 || h==1) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}
	public static void main(String args[]) {
		Leap a=new Leap();
		a.year();
		}
}
