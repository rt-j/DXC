package demos;
class Mammal{
	
	int age=1000;
	void eat() {
		System.out.println("MAmmmal Eat");
	}
}
class Dog extends Mammal{
	String breed;
	int age=50;
	public void display() {
		int age=10;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
	public void eat() {
		System.out.println("dog eat");
	}
}

public class DemoInheritance {
	

}
