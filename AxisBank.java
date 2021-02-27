package org.student;

public class AxisBank extends BankInfo{
public void Deposit() {System.out.println("You are inside Deposit method of Axis Bank");}

public static void main(String[] args) {
	AxisBank trans1123 = new AxisBank();
	trans1123.Deposit();
}
}
