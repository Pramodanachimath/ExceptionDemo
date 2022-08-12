package com.training.userdefined;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws InSufficeintBalanceException, ExceedingLimitException {
		try {
			if (amount > balance) {
				throw new InSufficeintBalanceException("amount > than balance");

			}
			if (amount > 10000) {
				throw new ExceedingLimitException("Exceeing day limits");
			}

			else {
				balance -= amount;
				System.out.println("amount withdrawn");
				System.out.println("Balance is " + balance);
			}
		} catch (Exception e) {
			System.out.println("Exception " + e);
			throw e;
		} finally {
			System.out.println("Close");
		}
		System.out.println("Completed");
	}

}
