package com.Felight.collection;

import java.util.*;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("White");
		myList.add("Black");
		myList.add("Green");
		myList.add("Yellow");
		myList.add("Pink");
		
		for(String str : myList){
			System.out.println(str);
		}
		Collections.sort(myList);
		
		System.out.println("----------------------------------");
		for(String str : myList){
			System.out.println(str);
		}
	}

}
