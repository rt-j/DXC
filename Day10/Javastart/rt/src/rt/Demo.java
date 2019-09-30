
package rt;




/*
 * Object as a parameter and call by reference
 */
class Demo {

	int num1 = 100;
	int num2 = 200;

	public void display(int num1,Demo d2) {
		this.num2--;
		num2++;
		System.out.println(num2);
		this.num1++;
		this.num1++;
		d2.num1++;
		System.out.println(this.num1);
		
		System.out.println(num1+this.num1+d2.num1);
	}
	public void display2() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {
		int num1=20;
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		System.out.println(num1+d1.num1+d2.num1);
		d1.display(num1,d1);
		d1.display2();
		d2.display2();
		
		System.out.println(num1+d1.num1+d2.num1);
	}
}
