/**
 * 
 */
package com.java8.concepts;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author karthik.penchala
 *
 */
public class Predicate2Demo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p=i->i%2==0;
		Predicate<Integer> p2=i->i%3==0;
		System.out.println(p.test(10));
		System.out.println(p.and(p2).test(18));
		System.out.println(p.or(p2).test(15));
		System.out.println(p.negate().test(12));
		
		// Bipredicate 
		BiPredicate<Integer, Integer> p3=(a,b) -> a%b==0;
		System.out.println(p3.test(20, 10));
		System.out.println(p3.test(20, 9));
		
		
		
		
	}

}
