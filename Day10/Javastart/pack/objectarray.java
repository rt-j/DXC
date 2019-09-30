package pack;

public class objectarray {
	public static void main(String[] args) {
		ConstructorCalling p[]= new ConstructorCalling[5];
		for (int i = 0; i < p.length; i++) {
			p[i] = new ConstructorCalling();
			/*
			 this will call the default constructor cuz it has no parameters
			 */
		}
		System.out.println(p[3].getBill());
	}

}
