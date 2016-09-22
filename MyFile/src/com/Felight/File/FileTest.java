package com.Felight.File;

import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		FileManager fileManager = new FileManager();
		try{
			System.out.println(fileManager.writeToFile("test.txt", "This is my File \n"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("==============================");
		try {
			System.out.println(fileManager.readFile("test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=================================");
		try {
			System.out.println(fileManager.readFilePlus("test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
