package com.Collections.Demo;

import java.util.ArrayList;

public class CollectionsDemo {
	
	public static String name="karthik 2";
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
				for(int i=5;i<10;i++){
					al.add(i);
				
				}
				
		System.out.println(al.clone());		
		al.clear();		
		System.out.println(al);
		
	}
	
	
}
