package com.Felight.File;

import java.io.IOException;

public class ReadTest {
	public static void main(String[] args){
		FileReading fr = new FileReading();
	
		try {
			System.out.println(fr.readFile("test.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
