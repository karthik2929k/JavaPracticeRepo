package com.Multithreading.Demo;

public class JoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
	
		ChildThread2.mt=Thread.currentThread();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		
		ChildThread2 ct=new ChildThread2();
		Thread t2=new Thread(ct);
		t2.setPriority(9);
		System.out.println(t2.getPriority());
		t2.start();
	    // mt.join();
		for (int i=1;i<=4;i++){
			System.out.println(" Main Thread "+ i);
		}
	}	
}

class ChildThread2 implements Runnable{
	
	static Thread mt;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		/*try{
			mt.join();
			// Thread.sleep(2000);
		}catch(InterruptedException ie ){
			Thread.currentThread().interrupt();
		}*/
		for(int i=1;i<=4;i++){
			System.out.println("Child thread "+i);
		}
		
	}
}




class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("Thread 1"));
        Thread thread2 = new Thread(new Task("Thread 2"));

        thread1.start();
        thread2.start();

        try {
            // Wait for thread1 to finish
            thread1.join();
            
            // Wait for thread2 to finish
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
           // 	Thread.currentThread().join();    ------ Dead Lock Situation -- if both threads call join method 
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

