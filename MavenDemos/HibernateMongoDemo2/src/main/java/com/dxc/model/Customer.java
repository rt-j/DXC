package com.dxc.model;

public class Customer {
	private int custId;
	private String custName;
	private String custaddress;
	private int billAmount;
	public Customer(int custId, String custName, String custaddress, int billAmount) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custaddress = custaddress;
		this.billAmount = billAmount;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((custaddress == null) ? 0 : custaddress.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (custaddress == null) {
			if (other.custaddress != null)
				return false;
		} else if (!custaddress.equals(other.custaddress))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custaddress=" + custaddress
				+ ", billAmount=" + billAmount + "]";
	}
	
}
