package assign;

import java.util.ArrayList;

public class User {
	private String email;
	private String padssword;
	private String phoneNumber;
	private Address adress;
	private  boolean verified;
	private ArrayList<Role> roles;
	private boolean enabled;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPadssword() {
		return padssword;
	}
	public void setPadssword(String padssword) {
		this.padssword = padssword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public ArrayList<Role> getRoles() {
		return roles;
	}
	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public User(String email, String padssword, String phoneNumber, Address adress, boolean verified,
			ArrayList<Role> roles, boolean enabled) {
		super();
		this.email = email;
		this.padssword = padssword;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.verified = verified;
		this.roles = roles;
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", padssword=" + padssword + ", phoneNumber=" + phoneNumber + ", adress="
				+ adress + ", verified=" + verified + ", roles=" + roles + ", enabled=" + enabled + "]";
	}
	
	

}
