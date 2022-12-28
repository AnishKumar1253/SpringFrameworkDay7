package com.masai.app;

public class Contact {
	private String mContactEmail;
	private String mContactFN;
	private String mContactId;
	private String mContactLN;
	public String getmContactEmail() {
		return mContactEmail;
	}
	public void setmContactEmail(String mContactEmail) {
		this.mContactEmail = mContactEmail;
	}
	public String getmContactFN() {
		return mContactFN;
	}
	public void setmContactFN(String mContactFN) {
		this.mContactFN = mContactFN;
	}
	public String getmContactId() {
		return mContactId;
	}
	public void setmContactId(String mContactId) {
		this.mContactId = mContactId;
	}
	public String getmContactLN() {
		return mContactLN;
	}
	public void setmContactLN(String mContactLN) {
		this.mContactLN = mContactLN;
	}
	public Contact(String mContactEmail, String mContactFN, String mContactId, String mContactLN) {
		super();
		this.mContactEmail = mContactEmail;
		this.mContactFN = mContactFN;
		this.mContactId = mContactId;
		this.mContactLN = mContactLN;
	}
	public Contact() {
		super();
	}
	@Override
	public String toString() {
		return "Contact [mContactEmail=" + mContactEmail + ", mContactFN=" + mContactFN + ", mContactId=" + mContactId
				+ ", mContactLN=" + mContactLN + "]";
	}
	
	

}
