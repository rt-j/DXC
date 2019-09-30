package demos;
/*
 * Object as a parameter and call by reference
 */
class Demonumbers {

	int num1 = 100;
	int num2 = 200;

	public void display(int num1,Demonumbers d2) {
		num2--;
		this.num1++;
		d2.num1++;
		
		
	}
	public void display2() {
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {
		int num1=20;
		
		Demonumbers d1 = new Demonumbers();
		Demonumbers d2 = new Demonumbers();
		d1.display(num1,d1);
		d1.display2();
		
System.out.println(num1+d1.num1+d2.num1);
	}
}
