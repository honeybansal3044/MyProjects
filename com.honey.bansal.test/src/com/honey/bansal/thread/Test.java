package com.honey.bansal.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		int a = Integer.parseInt("1");
		System.out.println(a);
		String aa = new String("Hello");
		String bb = "Hello";

		System.out.println(aa == bb);

		int[] nums = { 10, 20, 40, 30, 70, 50, 60 };

		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));

		byte b = -127;
		char c = 65535;

		System.out.println(b + c);

		Scanner scnr = new Scanner(new FileInputStream("hello.txt"));
		System.out.println(scnr.next());
		scnr.close();

		List<String> languages = Arrays.asList("Java", "C++", "Scala", "Groovy");

		// Getting Iterator from List in Java
		Iterator<String> iterator = languages.iterator();
		System.out.println("Iterating List in Java using Iterator ");

		// Iterating through all elements of List
		while (iterator.hasNext()) {
			System.out.printf("Current element in List is %s %n", iterator.next());
		}
		System.out.printf("End");
	}

}
