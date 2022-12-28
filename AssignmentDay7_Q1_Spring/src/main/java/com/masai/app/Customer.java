package com.masai.app;

public class Customer {
	private Contact mCustomerContact;
	private String mCustomerId;
	private String mCustomerName;
	public Customer() {
		super();
		
	}
	public Customer(Contact mCustomerContact, String mCustomerId, String mCustomerName) {
		super();
		this.mCustomerContact = mCustomerContact;
		this.mCustomerId = mCustomerId;
		this.mCustomerName = mCustomerName;
	}
	public Contact getmCustomerContact() {
		return mCustomerContact;
	}
	public void setmCustomerContact(Contact mCustomerContact) {
		this.mCustomerContact = mCustomerContact;
	}
	public String getmCustomerId() {
		return mCustomerId;
	}
	public void setmCustomerId(String mCustomerId) {
		this.mCustomerId = mCustomerId;
	}
	public String getmCustomerName() {
		return mCustomerName;
	}
	public void setmCustomerName(String mCustomerName) {
		this.mCustomerName = mCustomerName;
	}
	@Override
	public String toString() {
		return "Customer [mCustomerContact=" + mCustomerContact + ", mCustomerId=" + mCustomerId + ", mCustomerName="
				+ mCustomerName + "]";
	}
	
	
}
