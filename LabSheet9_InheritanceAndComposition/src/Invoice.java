
public class Invoice {
	private int invid;
	private Customer customer;
	private double amount;
	
	public Invoice(int id,Customer customer,double amount) {
		this.invid = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getInvID() {
		return this.invid;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
		
	public int getCustomerID() {
		return this.getCustomer().getID();
	}
	
	public String getCustomerName() {
		return this.getCustomer().getName();
	}
	
	public int getCustomerDiscount() {
		return this.getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return this.getAmount()-this.getAmount()*this.getCustomerDiscount()/100;
	}
	
	public String toString() {
		return "Invoice[id="+getInvID()+",customer="+customer.toString()+",amount="+this.getAmountAfterDiscount()+"]";
	}
	
}
