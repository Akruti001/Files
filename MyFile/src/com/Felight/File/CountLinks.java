package com.Felight.File;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLinks {
	
	public int readFile(String filename) throws IOException {
		File file = new File(filename);
		FileReader filereader = new FileReader(file);
		int count = 0;
		if (file.exists()) {
			if (file.canRead()) {
				long l = file.length();
				char[] data = new char[(int) l];
				filereader.read(data);
				for(int i =0;i<l;i++){
					if(data[i]=='h' && data[i+1] == 't' && data[i+2] == 't' && data[i+3] =='p'){
					count++;
					}
				}
				filereader.close();
				return count;
			} else {
				filereader.close();
				throw new IOException("Plz,Check if U have the permission to  read File");
			}
		} else {
			filereader.close();
			throw new IOException("File  Does not Exists");
		}
	}
	public static void main(String[] args){
		CountLinks count = new CountLinks();
		try {
			int total = count.readFile("Felight.txt");
			System.out.println("Total HyperLink is :"+ total);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
}


