package com.feb.test.aop;

public class AcnoNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3146494188885462921L;

	@Override
	public String toString() {
		return "Account No Invalid";
	}
}
