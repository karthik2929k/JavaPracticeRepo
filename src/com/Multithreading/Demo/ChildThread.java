package com.Multithreading.Demo;

public class ChildThread extends Thread{
	
	public static String name ="karthik";	
	
		@Override
		public void run(){
			// TODO Auto-generated method stub
			try{
			for(int i=0;i<10;i++){
				System.out.println("Child Thread");
					if(i==3){
						Thread.sleep(1000);
					}
			}
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
}


