package com.Felight.collection;

import java.util.Stack;

public class stack_data {
	public static void main(String[] args){
	
		Stack<String> s = new Stack<String>();
		s.push("Black");
		s.push("white");
		s.push("Green");
		s.push("Yellow");
		s.pop();
		s.pop();
		s.add("pink");
		for(int i=0;i<s.size();i++){
			System.out.println(s.get(i));
		}
		
		
	}
}
