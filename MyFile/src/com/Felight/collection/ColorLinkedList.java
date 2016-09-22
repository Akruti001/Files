package com.Felight.collection;

import java.util.LinkedList;

public class ColorLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();	
		myList.add("White");
		myList.add("Green");
		myList.add("Pink");
		myList.add("Yellow");
		myList.addFirst("Black");
		myList.addLast("Purple");
		myList.add(2, "Grey");
		myList.remove(3);
		
		for(int i=0;i<myList.size();i++){
			System.out.println(myList.get(i));
		}
	}

}
