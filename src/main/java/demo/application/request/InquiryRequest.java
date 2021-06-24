package demo.application.request;


public class InquiryRequest {
	
	private int inquiryNo;
	
	private String userName;
	
	private String userEmail;
	
	public int getInquiryNo() {
		return inquiryNo;
	}

	public void setInquiryNo(int inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getInquiryContent() {
		return inquiryContent;
	}

	public void setInquiryContent(String inquiryContent) {
		this.inquiryContent = inquiryContent;
	}

	public boolean isAbjustmentFlag() {
		return abjustmentFlag;
	}

	public void setAbjustmentFlag(boolean abjustmentFlag) {
		this.abjustmentFlag = abjustmentFlag;
	}

	private String inquiryContent;
	
	private boolean abjustmentFlag;


}
