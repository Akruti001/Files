package com.Felight.File;

import java.io.IOException;

public class CountImageLink {

	public static void main(String[] args) throws IOException {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					FileManager filemanger = new FileManager();
					String content = filemanger.readFile("Felight.txt");
					char[] data = content.toCharArray();
					int linkCount = 0;
					for(int i= 0;i<data.length;i++){
						if(data[i] == 'h' && data[i+1] == 't' && data[i+2]== 't' && data[i+3]=='p'){
							linkCount++;
						}
					}
					filemanger.writeToFile("Image.txt", " "+linkCount);
					System.out.println("Total Images are :"+linkCount);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		t.start();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					FileManager filemanger = new FileManager();
					String content = filemanger.readFile("Felight.txt");
					char[] data = content.toCharArray();
					int imgCount = 0;		
					for(int i=0;i<data.length;i++){
						if((data[i]=='i' && data[i+1]=='m' && data[i+2]=='g') || (data[i]=='p' && data[i+1]=='n' && data[i+2]=='g') ){
							imgCount++;
						}
					}
					filemanger.writeToFile("Image.txt", " "+imgCount);
					System.out.println("Total Images are :"+imgCount);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		t1.start();
		
		
	}

}
