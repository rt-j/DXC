package demos;

public class EmployeeTest {

	public static void main(String[] args) {
		
		PermanentEmployee permanentEmployee = new PermanentEmployee(19181, "Neha");
		permanentEmployee.setRegularSalary(62000);
		permanentEmployee.setRegularBonus(100000); //in dreams
		
		System.out.println(permanentEmployee);
		
		ContractEmployee contractEmployee = new ContractEmployee(152552, "Tufail");
		contractEmployee.setContractDuration(60);
		contractEmployee.setPayPerHour(1);
		

		System.out.println(contractEmployee);
	}

}
