package com.training.basics;

public class Bank {

	int balance=50000;
	void withdraw(int amount) throws Exception {
		System.out.println("in Bank");
		try {
			if(amount > 6000) {
				throw new Exception("Exceeded limit"); 
			}
	
		System.out.println("Balance amount");
		}
		catch(Exception e) {
			System.out.println( e);
			System.out.println(e.getMessage());
			throw e;
		}
		finally {
			System.out.println("close db");
		}
		System.out.println("Server Completed");
	}
}
