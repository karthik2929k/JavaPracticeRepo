/**
 * 
 */
package com.java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author karthik.penchala
 *
 */
public class FunctionDemo {
	
	public static void main(String[] args) {
		Function<String, Integer> f=s->s.length();
		
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee("karthik 1", 30000.0));
		emplist.add(new Employee("karthik 2", 40000.0));
		emplist.add(new Employee("karthik 3", 70000.0));
		emplist.add(new Employee("karthik 4", 80000.0));
		emplist.add(new Employee("karthik 5", 390000.0));
		
		System.out.println(f.apply("Karthik hi ! "));
		System.out.println(emplist);

		Predicate<Double> p2=d->d>=50000.0;
		Function<Employee, Double> f2=e->e.salary;
						// OR simply we pass employee to predicate only 
		Predicate<Employee> e2=e->e.salary>=50000.0;
		 
		for(Employee e:emplist){
			if(p2.test(f2.apply(e))){
				System.out.println("Emp have more salary :: "+ e.nameofemployee);
			}
			// or 
			System.out.println(" ******************************");
			if(e2.test(e)){
				System.out.println(""+e.nameofemployee+"   "+e.salary);
			}
		}
	}	
}
