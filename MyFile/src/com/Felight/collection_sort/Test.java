package com.Felight.collection_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Jack", 606060, "M"));
		empList.add(new Employee(2000, "Rack", 30000, "F"));
		empList.add(new Employee(6, "Mack", 40000, "M"));
		empList.add(new Employee(100, "ken", 35550, "F"));
		empList.add(new Employee(2, "neo", 22260, "M"));

		Iterator<Employee> empListIterator = empList.iterator();

		while (empListIterator.hasNext()) {
			System.out.println(empListIterator.next());
		}
		System.out.println("------------------------------------------------------------");

		Collections.sort(empList);
		empListIterator = empList.iterator();
		while (empListIterator.hasNext()) {
			System.out.println(empListIterator.next());
		}

		System.out.println("------------------------------------------------------------");

		Collections.sort(empList, new Compartor_sort());

		empListIterator = empList.iterator();
		while (empListIterator.hasNext()) {
			System.out.println(empListIterator.next());
		}

		System.out.println("------------------------------------------------------------");
		Collections.sort(empList, new Sort_Name());
		empListIterator = empList.iterator();

		System.out.println("Sorted by name");
		while (empListIterator.hasNext()) {
			System.out.println(empListIterator.next());
		}

		Comparator<Employee> sortgender = new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getGender().compareTo(emp2.getGender());
			}
		};
		System.out.println("------------------------------------------------------------");
		Collections.sort(empList, sortgender);
		empListIterator = empList.iterator();
		while (empListIterator.hasNext()) {
			System.out.println(empListIterator.next());
		}


	Comparator<Employee> descSort = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee emp1, Employee emp2) {
			if(emp1.getSalary() > emp2.getSalary())
				return -1;
			else if (emp1.getSalary() < emp2.getSalary())
				return 1;
			else
				return 0;
			}
		};
		
		System.out.println("------------------------------------------------------------");
		Collections.sort(empList,descSort);
		empListIterator = empList.iterator();
		while (empListIterator.hasNext()) {
			System.out.println(empListIterator.next());
		}
}
}