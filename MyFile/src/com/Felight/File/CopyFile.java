package com.Felight.File;

import java.io.*;

public class CopyFile {
	public void copy(String source,String destination) throws IOException{
		
		// reading file
		File file = new File(source);
		FileReader  fr = new FileReader(file);
		
		File file1 = new File(destination);
		FileWriter fw = null;
		BufferedReader reader;
		String value = " ";
		
		if(file.exists()){
			if (file.canRead()) {
				reader = new BufferedReader(fr);
				String line = " ";
				StringBuilder data = new StringBuilder(); 
					while((line=reader.readLine())!=null){
					data.append(line + "\n");
					}
				reader.close();
				 value =  data.toString();
				//return data.toString();
			} 
			else {
				fr.close();
				throw new IOException("Plz,Check if U have the permission to  read File");
			} 
		}else {
				fr.close();
				throw new IOException("File  Does not Exists");
		}
		//writing into file
		
		if(file1.exists()){
			if(file1.canWrite()){
				try{
				fw = new FileWriter(file1,true);
				fw.write(value);
				}
				finally{
					fw.close();
				}
			}
		}else{
			file1.createNewFile();
			System.out.println("File is Created ");
			
		}
		
	}
	
	public static void main(String[] args){
		CopyFile copyfile = new CopyFile();
		try {
			copyfile.copy("test.txt","test1.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
