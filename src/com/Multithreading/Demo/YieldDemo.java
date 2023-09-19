package com.Multithreading.Demo;

public class YieldDemo {
	public static void main(String[] args) {
		
		Child2 ct=new Child2();
	//	Thread t=new Thread(new Child2());
		ct.start();
		
		for(int i=0;i<=10;i++){
			System.out.println("Main thread :: ");
		}
	}
}

class Child2 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println("Child2 method "+i);
			Thread.yield();
		}
	}
}
