package com.Felight.collection_sort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("Ahmedabad","Gandhinagr");
		myMap.put("Karnataka","Banglore");
		myMap.put("Mahrastra","Nayi Bombay");
		myMap.put("India","NayiDelhi");
	Iterator<String> keyIterator = myMap.keySet().iterator();
		//Iterator<String> valueIterator = myMap.values().iterator();
	while(keyIterator.hasNext()){
		System.out.println(myMap.get(keyIterator.next()));
	}
	}

}
