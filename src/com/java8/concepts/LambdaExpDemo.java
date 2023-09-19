package com.java8.concepts;

import java.util.ArrayList;
import java.util.function.Predicate;

import MyInterfaces.MyFunctionalinterf;

public class LambdaExpDemo implements MyFunctionalinterf{
	
	
	
	public static void main(String[] args) {
		MyFunctionalinterf i=(a,b)-> {return a+b;};
		int n = i.m1(5,8);
		System.out.println(n);
		i.m2();
		MyFunctionalinterf.m3();
	}

	@Override
	public int m1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}	
}


class Test implements MyFunIntref2{

	
	public static void main(String[] args) {
		MyFunIntref2 a=(i,j)-> System.out.println("I value is "+i+" j value is "+j);
		a.add(4, 8);
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}


// Pre defined Functional Interfaces (Predicate)

class PredicateDemo{
	
	public static void main(String[] args) {
		
		int[] intArray={1,3,2,4,5,6,8,12,14};
		Predicate<Integer> p=i->i%2==0;
		
		for(int x1: intArray){
			if(p.test(x1)){
				System.out.println(x1);
			}
		}
		
		int[] ar2={10,2,2,3,22,33,12,122,33,222,44};
		ArrayList<Integer> alst=new ArrayList<>();

		for(int i1:ar2){
			alst.add(i1);
		}
		ArrayList<Integer> al= PredicateDemo.m1(alst);
		System.out.println(al);
	}
	
	public static ArrayList<Integer> m1(ArrayList<Integer> itr){
		
		ArrayList<Integer> allist=new ArrayList<>();
		ArrayList<Integer> allist2=new ArrayList<>();
		Predicate<Integer> p=i->i>=10;
		for(int x1:itr){
			
			if(p.test(x1)){
				allist.add(x1);
			}else if(!p.test(x1)){
				allist2.add(x1);
			}
		}
		
		
		return allist;
	}
}



















