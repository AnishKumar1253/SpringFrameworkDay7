package com.masai.app;

public class RateUpdateDetails {

	private Customer mCustomerDetails;
	private String mRateId;
	private RateInfo mRateInfo;
	public Customer getmCustomerDetails() {
		return mCustomerDetails;
	}
	public void setmCustomerDetails(Customer mCustomerDetails) {
		this.mCustomerDetails = mCustomerDetails;
	}
	public String getmRateId() {
		return mRateId;
	}
	public void setmRateId(String mRateId) {
		this.mRateId = mRateId;
	}
	public RateInfo getmRateInfo() {
		return mRateInfo;
	}
	public void setmRateInfo(RateInfo mRateInfo) {
		this.mRateInfo = mRateInfo;
	}
	public RateUpdateDetails(Customer mCustomerDetails, String mRateId, RateInfo mRateInfo) {
		super();
		this.mCustomerDetails = mCustomerDetails;
		this.mRateId = mRateId;
		this.mRateInfo = mRateInfo;
	}
	public RateUpdateDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RateUpdateDetails [mCustomerDetails=" + mCustomerDetails + ", mRateId=" + mRateId + ", mRateInfo="
				+ mRateInfo + "]";
	}
	
	
}
