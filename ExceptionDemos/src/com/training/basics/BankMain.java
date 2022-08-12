package com.training.basics;

public class BankMain {

	public static void main(String[] args) {
System.out.println("In ATM");
		Bank bank=new Bank();
		try {
			bank.withdraw(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Amount Withdrawn");
		System.out.println("Good bye");
	}

}
