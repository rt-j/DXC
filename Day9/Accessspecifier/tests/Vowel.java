package tests;
import java.util.*;
public class Vowel{
	Scanner s=new Scanner(System.in);
	char g;
	public void display() {
		System.out.println("Enter character");
		g=s.next().charAt(0);
	
	if(g=='a'||g=='e'||g=='i'||g=='o'||g=='u'||g=='A'||g=='B'||g=='C'||g=='D'||g=='E') 
		System.out.println("It is vowel");
	else
		System.out.println("Not a vowel");
	
	}
			public static void main(String args[]) {
				 Vowel v=new Vowel();
				 v.display();
			}
}