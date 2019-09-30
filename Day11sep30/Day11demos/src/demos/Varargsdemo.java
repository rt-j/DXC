package demos;

public class Varargsdemo {
public static int sum(int g,int...numbers)
{
	int s=0;
	for(int i:numbers)
		s+=i;
	return s;
	
	
}
public static void main(String[] args) {
	System.out.println(sum(4,5,6,7,8,6));
}
}
