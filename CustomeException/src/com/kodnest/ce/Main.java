package com.kodnest.ce;


class Bank{
	void debit(int balance) throws InSuffucantBalanceException {
		System.out.println("Balance :"+balance);
		if(balance<0) {
			throw new InSuffucantBalanceException();
		}
	}

}
class InSuffucantBalanceException extends Exception{
	public InSuffucantBalanceException() {
		System.out.println("InSufficant Balance!, Try Entering Lesser Amount next time");
	}
}

public class Main {

	public static void main(String[] args) throws InSuffucantBalanceException {
		// TODO Auto-generated method stub
		
		int balance=700;
		Bank b=new Bank();
		b.debit(balance);
		balance-=400;
		b.debit(balance);
		balance-=400;
		b.debit(balance);

	}

}
