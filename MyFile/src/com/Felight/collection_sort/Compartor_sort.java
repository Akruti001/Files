package com.Felight.collection_sort;

import java.util.*;

public class Compartor_sort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1,Employee emp2 ) {
		if(emp1.getSalary() < emp2.getSalary())
			return -1;
		else if (emp1.getSalary() > emp2.getSalary())
			return 1;
		else
			return 0;
		}
	}
