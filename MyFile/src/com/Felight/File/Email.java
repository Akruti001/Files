package com.Felight.File;

import java.io.*;

public class Email {
	static boolean isValidUserName(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(email);
		return m.matches();
	}

	public void filterEmail(String mail) throws IOException {
		File file = new File(mail);
		FileReader fileReader = null;
		BufferedReader reader = null;
		
		File gmail = new File("G.txt");
		FileWriter gfw = null;
		FileWriter gfw1 = null;
		File ymail = new File("Ymail.txt");
	
		
		String value = " ";
		String line = " ";
		if (file.exists()) {
			try {
				fileReader = new FileReader(file);
				reader = new BufferedReader(fileReader);
				StringBuilder data = new StringBuilder();
				int i=0;
				while ((line = reader.readLine()) != null) {
					// data.append(line + "\n");
					
					if (isValidUserName(line)) {
						//System.out.println(line + " \n");
						String[] text = line.split("@");
						//String[] text1 = line.split(".");
						for (String w : text) {
							//System.out.println(w + "\n");
							if (w.equals("ymail.com")) {
								System.out.println("ymail file");
								gfw = new FileWriter(ymail);
								gfw.write(line);
							}
							else if (w.equals("gmail.com")) {
								System.out.println("gmail file");
								gfw1 = new FileWriter(gmail);
								gfw1.write(line);
								System.out.println(line);
							}  
							
						}

					} else
						System.out.println("Emails is not valid ");
				}
				value = data.toString();
				gfw.close();
				gfw1.close();
				//yfw.close();
				reader.close();
				fileReader.close();
				

			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			throw new IOException("File is not Checked");
		}

	}

	public static void main(String[] args) {
		Email email = new Email();
		try {
			email.filterEmail("Email.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}