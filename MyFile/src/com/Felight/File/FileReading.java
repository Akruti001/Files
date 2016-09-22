package com.Felight.File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	// Reading from text file
		public String readFile(String filename) throws IOException {
			File file = new File(filename);
			FileReader filereader = new FileReader(file);
			if (file.exists()) {
				if (file.canRead()) {
					long l = file.length();
					char[] data = new char[(int) l];
					filereader.read(data);
					filereader.close();
					return new String(data);
				} else {
					filereader.close();
					throw new IOException("Plz,Check if U have the permission to  read File");
				}
			} else {
				filereader.close();
				throw new IOException("File  Does not Exists");
			}
		}
}
