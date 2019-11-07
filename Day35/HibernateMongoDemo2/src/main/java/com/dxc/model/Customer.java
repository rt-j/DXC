package com.dxc.model;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.search.annotations.IndexedEmbedded;
@Entity
@Table(name="CustomerDetails")
public class Customer {
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid2")
	private String custId;
	private String custName;
	private String custaddress;
	@ElementCollection
	@IndexedEmbedded
	private Set<BillAmount> billAmount;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String custId, String custName, String custaddress, Set<BillAmount> billAmount) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custaddress = custaddress;
		this.billAmount = billAmount;
	}

	public Customer(String custName, Set<BillAmount> billAmount) {
		super();
		this.custName = custName;
		this.billAmount = billAmount;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
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
	public Set<BillAmount> getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Set<BillAmount> billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custaddress=" + custaddress
				+ ", billAmount=" + billAmount + "]";
	}

	
}
