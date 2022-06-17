package com.bankingapp.model;

public class Customer {
private int bankAccountNo;
private String password;
private int tPin;
public Customer(int bankAccountNo, String password) {
	super();
	this.bankAccountNo = bankAccountNo;
	this.password = password;
}
public Customer(int tPin) {
	super();
	this.settPin(tPin);
}
public int getBankAccountNo() {
	return bankAccountNo;
}
public void setBankAccountNo(int bankAccountNo) {
	this.bankAccountNo = bankAccountNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean verify(String password2) {
	return this.getPassword().equals(password2);
}
public int gettPin() {
	return tPin;
}
public void settPin(int tPin) {
	this.tPin = tPin;
}
public boolean verify(int tPin2) {
	return this.gettPin() == tPin2;
}
}
 