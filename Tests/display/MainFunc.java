package assignmentPackage;

public class MainFunc {
public static void main(String[] args) {
	DisplayDetails d[]=new DisplayDetails[2];
	
	for (int i = 0; i < d.length; i++) {
		d[i]=new DisplayDetails();
		d[i].getData();
		
	}
	System.out.println("The details are");
	for (int i = 0; i < d.length; i++) {
		System.out.println(d[i].toString());
	}
}
}

