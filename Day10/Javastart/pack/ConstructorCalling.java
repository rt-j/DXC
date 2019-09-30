package pack;

public class ConstructorCalling {
	String customerId="0";
	String customerName="Not availsble";
	int bill=0;
	
	public ConstructorCalling() {
		super();
		bill=45;
	}
	public ConstructorCalling(String customerId, String customerName, int bill) {
		customerId="0";
		customerName="no";
		bill=0;
		}
public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
public void displayCusInfo() {
	System.out.println("Customer"+customerId);
	System.out.println("Name"+customerName);
	System.out.println("bill is"+bill);
}

}
