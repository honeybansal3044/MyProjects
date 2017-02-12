package com.feb.test.aop;

public class Bank {
	private int amount = 5000;
	private String acno = "sbi123";

	public int deposit(String acno, int amount) {
		if (this.acno.equals(acno)) {
			System.out.println(this.amount);
			this.amount = this.amount + amount;
			System.out.println(this.amount);
			return this.amount;
		} else {
			throw new AcnoNotFoundException();
		}
	}

	public int withdraw(String acno, int amount) {
		if (this.acno.equals(acno)) {
			System.out.println(this.amount);
			this.amount = this.amount - amount;
			System.out.println(this.amount);
			return this.amount;
		} else {
			throw new AcnoNotFoundException();
		}
	}
}
