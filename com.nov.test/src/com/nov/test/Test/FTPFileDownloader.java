package com.nov.test.Test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FTPFileDownloader {

	public static void main(String[] args) {
		String server = "ftp.wpc.ncep.noaa.gov";
		int port = 21;
		String user = "user";
		String pass = "pass";

		//ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
		FTPClient ftpClient = new FTPClient();
		try {

			//ftp://ftp.wpc.ncep.noaa.gov/shapefiles/fop/FLOODOUTLOOK_latest.zip
			ftpClient.connect(server);
			ftpClient.login("anonymous", "anonymous");
			ftpClient.enterLocalPassiveMode();
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

			String[] files1 = ftpClient.getReplyStrings();
			
			String[] files = ftpClient.listNames();

			// APPROACH #1: using retrieveFile(String, OutputStream)
			String remoteFile1 = "/shapefiles/fop/FLOODOUTLOOK_latest.zip";
			File downloadFile1 = new File("C:/FLOODOUTLOOK_latest.zip");
			OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(downloadFile1));
			boolean success = ftpClient.retrieveFile(remoteFile1, outputStream1);
			outputStream1.close();

			if(success) {
				System.out.println("File #1 has been downloaded successfully.");
			}

			// APPROACH #2: using InputStream retrieveFileStream(String)
			/* String remoteFile2 = "/shapefiles/fop/FLOODOUTLOOK_latest.zip"; File downloadFile2 = new File("C:/testzip/FLOODOUTLOOK_latest.zip"); OutputStream outputStream2 = new BufferedOutputStream(new FileOutputStream(downloadFile2)); InputStream inputStream = ftpClient.retrieveFileStream(remoteFile2); byte[] bytesArray = new byte[4096]; int bytesRead = -1; while ((bytesRead = inputStream.read(bytesArray)) != -1) { outputStream2.write(bytesArray, 0, bytesRead); } boolean success = ftpClient.completePendingCommand(); if (success) { System.out.println("File #2 has been downloaded successfully."); } outputStream2.close(); inputStream.close(); */

		}catch(IOException ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}finally {
			try {
				if(ftpClient.isConnected()) {
					ftpClient.logout();
					ftpClient.disconnect();
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
