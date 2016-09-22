package com.Felight.File;

import java.io.IOException;

public class WriteTest {

	public static void main(String[] args) {
		FileWriting fw = new FileWriting();
		try {
			System.out.println(fw.writeToFile("test.txt", "Hello,... \n"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
