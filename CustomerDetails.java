package atmMachine;

import java.util.*; 
import java.util.function.Predicate; 
class CustomerDetails{ 
public CustomerDetails(int accNo, String accName, int pin, int balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.pin = pin;
		this.balance = balance;
	}
private int accNo; 
private String accName;  
private int pin; 
private int balance;
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "" + accNo + "\t\t " + accName + "\t\t\t" + pin + "\t" + balance + "\n";
}
}