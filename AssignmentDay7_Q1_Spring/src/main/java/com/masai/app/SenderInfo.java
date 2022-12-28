package com.masai.app;

import java.util.Date;

public class SenderInfo {
	private Date mSendDate;
	private Contact mSenderContact;
	private String mSenderDesc;
	public Date getmSendDate() {
		return mSendDate;
	}
	public void setmSendDate(Date mSendDate) {
		this.mSendDate = mSendDate;
	}
	public Contact getmSenderContact() {
		return mSenderContact;
	}
	public void setmSenderContact(Contact mSenderContact) {
		this.mSenderContact = mSenderContact;
	}
	public String getmSenderDesc() {
		return mSenderDesc;
	}
	public void setmSenderDesc(String mSenderDesc) {
		this.mSenderDesc = mSenderDesc;
	}
	public SenderInfo(Date mSendDate, Contact mSenderContact, String mSenderDesc) {
		super();
		this.mSendDate = mSendDate;
		this.mSenderContact = mSenderContact;
		this.mSenderDesc = mSenderDesc;
	}
	public SenderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SenderInfo [mSendDate=" + mSendDate + ", mSenderContact=" + mSenderContact + ", mSenderDesc="
				+ mSenderDesc + "]";
	}
	
	
}
