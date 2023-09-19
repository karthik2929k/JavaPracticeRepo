package com.Multithreading.Demo;

public class MultithreadingDemo {
	
	public static void main(String[] args) throws Exception{
		
		ChildThread ct=new ChildThread();
		System.out.println("Thread started bY "+ChildThread.name);
		ct.start();
		
		for (int i=0;i<10;i++){
			System.out.println("Main thread .. ");
			if(i==5){
				Thread.sleep(1000);
			}
		}
		
	}
}


