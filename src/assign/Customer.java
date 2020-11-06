package assign;

import java.util.ArrayList;

public class Customer extends User {
	
	
	private String forename;
	private String surname;
	private ArrayList<PaymentDetails> paymentDetails;
	private ArrayList<Bookable> favorites;
	private CustomerType customerType;
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public ArrayList<PaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(ArrayList<PaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	public ArrayList<Bookable> getFavorites() {
		return favorites;
	}
	public void setFavorites(ArrayList<Bookable> favorites) {
		this.favorites = favorites;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Customer [forename=" + forename + ", surname=" + surname + ", paymentDetails=" + paymentDetails
				+ ", favorites=" + favorites + ", customerType=" + customerType + "]";
	}
	public Customer(String email, String padssword, String phoneNumber, Address adress, boolean verified,
			ArrayList<Role> roles, boolean enabled, String forename, String surname,
			ArrayList<PaymentDetails> paymentDetails, ArrayList<Bookable> favorites, CustomerType customerType) {
		super(email, padssword, phoneNumber, adress, verified, roles, enabled);
		this.forename = forename;
		this.surname = surname;
		this.paymentDetails = paymentDetails;
		this.favorites = favorites;
		this.customerType = customerType;
	}
	


}
