package com.Felight.File;

import java.io.*;

public class FileManager {
	// writing into text file
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

	// Reading file using buffered reader
	public String readFilePlus(String filename) throws IOException {
		File file = new File(filename);
		FileReader fileReader = new FileReader(file);
		BufferedReader reader;

		if (file.exists()) {
			if (file.canRead()) {
				reader = new BufferedReader(fileReader);
				String line = "";
				StringBuilder data = new StringBuilder();
				while ((line = reader.readLine()) != null) {
					data.append(line + "\n");
				}
				reader.close();
				return data.toString();
			} else {
				fileReader.close();
				throw new IOException("Plz,Check if U have the permission to  read File");
			}
		} else {
			fileReader.close();
			throw new IOException("File  Does not Exists");
		}
	}
}
