package demos;

public class Example1 {
	{
		System.out.println("Anonymous block");
	}
	W w=new W();
	static {
		System.out.println("static");
	}
	public Example1() {
		// TODO Auto-generated constructor stub
		System.out.println("example cons called");
	}
	public static void main(String[] args) {
		System.out.println("main");
		new Example1();
		new Example1();
	}

}
