package com.Multithreading.Demo;

public class MyThread implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<4;i++){
			System.out.println("MyThread method ");
		}
	}

}
class ThreadDemo{
	
	public static void main(String[] args) {
		
		MyThread my=new MyThread();
		Thread t=new Thread(my);
		t.start();
		
		for(int i=0;i<5;i++){
			System.out.println("Karthik Thread ! ");
		}
		
	}
	
}

