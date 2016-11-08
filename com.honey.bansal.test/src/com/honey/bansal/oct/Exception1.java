package com.honey.bansal.oct;

import java.io.IOException;

class Exception1 {
	public static void main(String args[]) throws IOException {// declare exception
		M m = new M();
		m.method();

		System.out.println("normal flow...");
	}
}
