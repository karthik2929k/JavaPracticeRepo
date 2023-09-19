package com.Oops.Demo;

import sun.applet.Main;

public class OopsDemo {
	

}
//Overloading Example
class Animal{
	
}
class Monkey extends Animal{
	
}
class Test{
	
	public void m1(Animal a) {
		System.out.println("Animal class .. ");
	}
	public void  m1(Monkey m) {
		System.out.println("Monkey Methosd .. ");
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		Animal a=new Animal();
		t.m1(a);
		
		Monkey m=new Monkey();
		t.m1(m);
		
		Animal a1=new Monkey();
		t.m1(a1);
		
	}
}
// So here It will consider Comile time reference variable only. 
// not the runtime object so it is called as compile time polymorphism /static /early binding



//Overriding

class Parent{
	
	public void property(){
		System.out.println("My Property belongs to you ! ");
	}
	public void marry() {
		System.out.println("I am In ;love ");
	}
	
	public static void assets() {
		System.out.println("I have Assets for u");
	}
}



class Child extends Parent{
			
	public void marry() {
		System.out.println("I am Marriying her !");
	}
	
	public static void assets() {
		System.out.println("I have a job ! no need assets !");
	}
	
}

class Test2 {
	
	
	public static void main(String[] args) {
		
	//	Test2 t=new Test2();
		Parent p=new Parent();
		p.marry();
		p.property();
		p.assets();
		
		Child ch=new Child();
		ch.marry();
		ch.property();
		ch.assets();
		
		Parent pp=new Child();
		pp.marry();
		Parent.assets(); // static Reference can 
		
	}
}
// This is Overriding Runtime Polymorphism / late /dynamic  --- method resolution by runtime object 
// static methods cant be overriden -- if done it is called method hiding not overriding as shown above method execution take place by reference type not the runtime object 



// StaticBlocks Control flow Example 
class Mystatic {
	static int x=10;
	static{
		m1();
		System.out.println("First rank :");
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("Mina method !");
	}
	public static void  m1() {
		System.out.println(y);
		System.out.println("M 1 method ");
	}
	static {
		System.out.println("Second rank ");
		m1();
	}
	static int y=20;
}
// order of execution is -- Identify static members/blocks -- execute/assign static members/variables -- execution of main method 



// Instance Control flow
class MyInstance implements Cloneable{
	
	int i=20;
	{
		m1();
		System.out.println("First Instance ");
	}
	public static void main(String[] args) throws Exception{
	//	m1();
		MyInstance mi=new MyInstance();
		//ways to create object 
		MyInstance m2=(MyInstance)mi.clone();
		System.out.println("main method ");
	}
	public MyInstance(){
		System.out.println("I am Constructor ");
	}
	public void m1() {
		System.out.println(j);
		System.out.println("m1 method ");
	}
	{
	//	System.out.println(j);
		System.out.println("Second instance block ");
	}
	int j=50;
	
}
//order of execution is -- Identify instance members/blocks -- execute/assign instance members/variables -- execution of consructor --excute main method 





























