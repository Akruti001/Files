package com.Felight.collection_sort;

import java.util.*;

public class Collection_demo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Jack",606060,"M"));
		empList.add(new Employee(2000,"Rack",30000,"F"));
		empList.add(new Employee(6,"Mack",40000,"M"));
		empList.add(new Employee(100,"ken",35550,"F"));
		empList.add(new Employee(2,"neo",22260,"M"));
		
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
		
	}

}
