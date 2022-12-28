package com.masai.app;

import java.util.List;

public class RateUpdate {
	private String mRateUpdateId;
	private SenderInfo mSenderInfo;
	private List<RateUpdateDetails> mUpdateDetails;
	public String getmRateUpdateId() {
		return mRateUpdateId;
	}
	public void setmRateUpdateId(String mRateUpdateId) {
		this.mRateUpdateId = mRateUpdateId;
	}
	public SenderInfo getmSenderInfo() {
		return mSenderInfo;
	}
	public void setmSenderInfo(SenderInfo mSenderInfo) {
		this.mSenderInfo = mSenderInfo;
	}
	public List<RateUpdateDetails> getmUpdateDetails() {
		return mUpdateDetails;
	}
	public void setmUpdateDetails(List<RateUpdateDetails> mUpdateDetails) {
		this.mUpdateDetails = mUpdateDetails;
	}
	public RateUpdate(String mRateUpdateId, SenderInfo mSenderInfo, List<RateUpdateDetails> mUpdateDetails) {
		super();
		this.mRateUpdateId = mRateUpdateId;
		this.mSenderInfo = mSenderInfo;
		this.mUpdateDetails = mUpdateDetails;
	}
	public RateUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RateUpdate [mRateUpdateId=" + mRateUpdateId + ", mSenderInfo=" + mSenderInfo + ", mUpdateDetails="
				+ mUpdateDetails + "]";
	}
	
	
}
