package com.Felight.collection;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args){
	ArrayList<Object> emp = new ArrayList<>();
	emp.add(new Employee(1,"Abc",202020));
	emp.add(new Employee(2,"pqr",303534));
	emp.add(new Employee(3,"xyz",2505556));
	emp.add(new Employee(4,"aaa",598115));
	emp.add(new Employee(5,"rrr",598232));
	
		for(int i=0;i<emp.size();i++){
			System.out.println(emp.get(i));
		}
	}
}
