package com.Felight.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	
	public boolean writeToFile(String filename, String data) throws IOException {
		File file = new File(filename);
		FileWriter fileWriter = null;
		if (file.exists()) {
			try {
				fileWriter = new FileWriter(file, true);
				fileWriter.write(data);
				return true;
			} finally {
				try {
					fileWriter.close();
				} catch (IOException e) {
					throw e;
				}
			}
		} else {
			try {
				file.createNewFile();
				return writeToFile(filename, data);
			} catch (IOException e) {
				throw e;
			}
		}
	}

}
