/**
 * 
 */
package com.java8.concepts;

import java.util.function.Supplier;

/**
 * @author karthik.penchala
 *
 */
public class SupplierDemo {
		public static void main(String[] args) {
			
			Supplier<Integer> s=()->(int)(Math.random()*100); // (int) Math.random()*10 -- this is giving 0 always because 
			// Math.random gives double between 0-1 & bz of int it converts to 0 
			// 0*10 will be 0 
			System.out.println(s.get());
			
		}
}
