package com.Multithreading.Demo;

import com.sun.istack.internal.logging.Logger;

// Q1 Print even on one thread and odd nums on other thread 
class GiveEvens implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=30;i++){
			if(i%2 == 0){
				System.out.print(i);
			}
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
					Thread.currentThread().interrupt();
			}
		}
	}
}

public class EvenOddNumbers {
	
	private static final Logger log=Logger.getLogger(EvenOddNumbers.class);
	
	public static void main(String[] args) {
		
		//Thread constructor by classname 
		Thread t=new Thread(new GiveEvens());
		t.setPriority(8);
		t.start();
		
		for (int i = 0; i < 30; i++) {
			if (i % 2 != 0) {
				System.out.print(i);
			}
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				Thread.currentThread().interrupt();
			}
		}
	}
}


// Thread Operations 
/*System.out.println(Thread.currentThread().getName());
GiveEvens g = new GiveEvens();
Thread t2=new Thread(g);
g.run();
System.out.println(t2.getName());
System.out.println(Thread.currentThread().getName());*/
