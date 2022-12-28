package com.masai.app;

import java.util.Date;

public class RateInfo {
	private int mMaxQtyForRate;
	double mRateAmount;
	private Date mRateEndDate;
	private String mRateId;
	private Date mRateStartDate;
	public int getmMaxQtyForRate() {
		return mMaxQtyForRate;
	}
	public void setmMaxQtyForRate(int mMaxQtyForRate) {
		this.mMaxQtyForRate = mMaxQtyForRate;
	}
	public double getmRateAmount() {
		return mRateAmount;
	}
	public void setmRateAmount(double mRateAmount) {
		this.mRateAmount = mRateAmount;
	}
	public Date getmRateEndDate() {
		return mRateEndDate;
	}
	public void setmRateEndDate(Date mRateEndDate) {
		this.mRateEndDate = mRateEndDate;
	}
	public String getmRateId() {
		return mRateId;
	}
	public void setmRateId(String mRateId) {
		this.mRateId = mRateId;
	}
	public Date getmRateStartDate() {
		return mRateStartDate;
	}
	public void setmRateStartDate(Date mRateStartDate) {
		this.mRateStartDate = mRateStartDate;
	}
	public RateInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RateInfo(int mMaxQtyForRate, double mRateAmount, Date mRateEndDate, String mRateId, Date mRateStartDate) {
		super();
		this.mMaxQtyForRate = mMaxQtyForRate;
		this.mRateAmount = mRateAmount;
		this.mRateEndDate = mRateEndDate;
		this.mRateId = mRateId;
		this.mRateStartDate = mRateStartDate;
	}
	@Override
	public String toString() {
		return "RateInfo [mMaxQtyForRate=" + mMaxQtyForRate + ", mRateAmount=" + mRateAmount + ", mRateEndDate="
				+ mRateEndDate + ", mRateId=" + mRateId + ", mRateStartDate=" + mRateStartDate + "]";
	}
	
	

}
