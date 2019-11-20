package entities;

public class Movimentacao {
private int account;
private String name;
private double value;


public Movimentacao() {
	
}

public Movimentacao(int account, String name) {

	this.account = account;
	this.name = name;	
}



public Movimentacao(int account, String name, double initialDeposit) {

	this.account = account;
	this.name = name;
	depositIn(initialDeposit);
}

public int getAccount() {
	return account;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getValue() {
	return value;
}

public void depositIn(double value) {
	this.value += value;
	
}
public void withdrawOut(double value) {
	this.value -= value + 5;
}

public String toString() {
	return "Account data: " 
			+ account 
			+ ", "
			+"Holder: "
			+name
			+" Balance: "
			+ String.format("%.2f%n", value);
				
}
}
