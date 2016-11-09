package com.honey.bansal.mar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.honey.bansal.bean.Apartment;

public final class FileTest {

	public FileTest() {

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("honey.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("Hello, How are you ?");
		pw.flush();
		pw.close();
		
		Apartment apt = new Apartment();
		apt.setAddress("303");
		apt.setFloor("third");
		apt.setName("log");
		
		FileOutputStream fs = new FileOutputStream("apt.src");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(apt);
		os.flush();
		os.close();
		
		FileInputStream fi = new FileInputStream("apt.src");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Apartment apt1 = (Apartment) oi.readObject();
		apt1.getAddress();
		oi.close();
		
	}

}
