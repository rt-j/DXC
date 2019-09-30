package demos;

public class ContractEmployee extends Employee {

	private int payPerHour;
	private int contractDuration;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [\npayPerHour=" + payPerHour + ", \ncontractDuration=" + contractDuration
				+ ", \ngetEmployeeId()=" + getEmployeeId() + ", \ngetEmployeeName()=" + getEmployeeName() + "]";
	}

	
}
