package com.account;

public class Account {
	
private int balance;

 public void credit(int amount) {
	 if(amount>0) {
		 balance+=amount;
		 System.out.println(balance+"credite to your account");
		 
		 System.out.println("Your available balance is"+balance);
		 
	 }

 }
 
 public int getBalance() {
		return balance;
	}

 public void setBalance(int bal) {
	 if(bal>0) {
		 balance+=bal;
	 }
		
	}


public void debit(int amount) {
	 if(amount<balance) {
		 this.balance-=amount;
		 System.out.println("Your available balance is"+balance);
}else {
	 System.out.println("Low balance");

}
}
}