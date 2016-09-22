package com.Felight.collection;

public class ArrayEmp {
	int id;
	char name;
	double salary;

	public ArrayEmp() {
		this.id = (int) (Math.random() * 10);
		this.name = (char) Math.floor(97 + (26) * Math.random());
		this.salary = Math.random() * 100000;
	}

	public static void main(String[] args) {
		ArrayEmp emp = new ArrayEmp();

		ArrayEmp[] data = new ArrayEmp[10];
		ArrayEmp[] sal = new ArrayEmp[10];
		data[0] = new ArrayEmp();
		data[1] = new ArrayEmp();
		data[2] = new ArrayEmp();
		data[3] = new ArrayEmp();
		data[4] = new ArrayEmp();
		data[5] = new ArrayEmp();
		data[6] = new ArrayEmp();
		data[7] = new ArrayEmp();
		data[8] = new ArrayEmp();
		data[9] = new ArrayEmp();
		
		for(int i=0;i<10;i++){
			sal[i] = new ArrayEmp();
		}

		System.out.println("Display Details");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i].id + " " + data[i].name + " " + data[i].salary);
		}

		int temp = 0;

		for (int j = 1; j < data.length; j++) {
			for (int i = 0; i < j; i++) {
				if (data[i].id > data[j].id) {
					temp = data[j].id;
					data[j].id = data[i].id;
					data[i].id = temp;
				}
			}
		}
		System.out.println("Display Sorted Value");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i].id);
		}
		
		//desending order
		double temp1 = 0;
		for (int j = 1; j < sal.length; j++) {
			for (int i = 0; i < j; i++) {
				if (sal[i].salary > sal[j].salary) {
					temp1 = sal[j].salary;
					sal[j].salary = sal[i].salary;
					sal[i].salary = temp1;
				}
			}
		}
		System.out.println("Display dessending Value\n");
		
		/*for (int i = (data.length)-1; i >=0; i--) {
			System.out.println(sal[i].salary);
		}*/
		for (int i =0; i <sal.length; i++) {
			System.out.println(sal[i].salary);
		}

	}
}
