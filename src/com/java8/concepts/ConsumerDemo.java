/**
 * 
 */
package com.java8.concepts;

import java.util.function.Consumer;

/**
 * @author karthik.penchala
 *
 */
public class ConsumerDemo {
	
	public static void main(String[] args) {
		Consumer<Employee> c=e->e.salary+=1000.0;
		
		Employee e1=new Employee("rahul", 1000.0);
		c.accept(e1);
		System.out.println(e1.salary);
		
	}


}
