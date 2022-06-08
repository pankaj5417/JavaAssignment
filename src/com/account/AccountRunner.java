package com.account;

public class AccountRunner {

	public static void main(String[] args) {
		
		Account rahul= new Account();
		
		rahul.credit(500);
		rahul.debit(200);
		rahul.setBalance(10);
		System.out.println(rahul.getBalance());
		

	}

}
