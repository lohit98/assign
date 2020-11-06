package com.training.org;

public class CustomerType {
private String customerType;

@Override
public String toString() {
	return "CustomerType [customerType=" + customerType + "]";
}

public CustomerType(String customerType) {
	super();
	this.customerType = customerType;
}

public String getCustomerType() {
	return customerType;
}

public void setCustomerType(String customerType) {
	this.customerType = customerType;
}

public CustomerType() {
	super();
}
}
