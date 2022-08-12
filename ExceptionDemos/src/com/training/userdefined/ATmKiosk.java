package com.training.userdefined;

public class ATmKiosk {

	public static void main(String[] args) {
		Bank bank = new Bank(50000);

		try {
			bank.withdraw(11000);
			System.out.println("amount withdrawn successfully");
		} catch (InSufficeintBalanceException | ExceedingLimitException e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e);
		}

		System.out.println("Bye");

	}

}
