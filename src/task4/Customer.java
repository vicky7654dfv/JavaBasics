package task4;

class Customer extends Person{
	String cusid,billid;
	
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public void setBillid(String billid) {
		this.billid = billid;
	}
	
	
	
	public String getCusid() {
		return cusid;
	}
	public String getBillid() {
		return billid;
	}
}
