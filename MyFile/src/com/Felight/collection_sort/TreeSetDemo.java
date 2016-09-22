package com.Felight.collection_sort;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Employee> mytree = new TreeSet<Employee>();
		mytree.add(new Employee(1, "Jack", 606060, "M"));
		mytree.add(new Employee(2000, "Rack", 30000, "F"));
		mytree.add(new Employee(6, "Mack", 40000, "M"));
		mytree.add(new Employee(100, "ken", 35550, "F"));
		mytree.add(new Employee(2, "neo", 22260, "M"));
		
		Iterator<Employee> emp = mytree.iterator();
		while(emp.hasNext()){
			System.out.println(emp.next());
		}

	}

}
