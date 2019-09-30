package demos;

public class PermanentEmployee extends Employee {

	private int regularSalary;
	private int regularBonus;
	
	public PermanentEmployee() {
		
	}

	public PermanentEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		System.out.println("name called");
		
		
	}

	public PermanentEmployee(int regularSalary, int regularBonus) {
		super();
		System.out.println("sal called");
		this.regularSalary = regularSalary;
		this.regularBonus = regularBonus;
	}

	public int getRegularSalary() {
		return regularSalary;
	}

	public void setRegularSalary(int regularSalary) {
		this.regularSalary = regularSalary;
	}

	public int getRegularBonus() {
		return regularBonus;
	}

	public void setRegularBonus(int regularBonus) {
		this.regularBonus = regularBonus;
	}

	@Override
	public String toString() {
		return "PermanentEmployee \n[ Name : "+getEmployeeName()+ "\n[ Emp Id :"+ getEmployeeId()+" [\nregularSalary=" + regularSalary + ",\n regularBonus=" + regularBonus + "]";
	}

	
	
}
