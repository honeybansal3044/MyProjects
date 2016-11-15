package com.nov.test.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Honey Bansal
 */
public class Test {

	public static void main(String[] args) throws IOException {
		main1();

	}
	
	public static void main1() throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(".\\data\\input.txt");
			out = new FileOutputStream(".\\data\\output.txt");

			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main2() throws IOException {
	      FileReader in = null;
	      FileWriter out = null;
	      try {
	         in = new FileReader(".\\data\\input.txt");
	         out = new FileWriter(".\\data\\output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	}

}
