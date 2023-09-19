package MyClasses;


public class InnnerclassesDemo {
	
	int i=0;
	static String name="karthik" ;
	static int p= 20;
	final int r=00;
	
	//Inner class inside a class
	class Test{
		public void m1() {
			System.out.println("Hello  .. ");
			System.out.println(i);
			System.out.println(name);
			System.out.println(p);
			System.out.println(r);
		}
	}
	
	public void m2(){
		System.out.println("Outer m2 method :: ");
	}
	
	//inner class inside a method
	public void m3(){
		int i=1009;
		class Test{
			public void m1() {
				System.out.println(i);
			}
		}
		Test t=new Test();
		t.m1();
	}
	public static void main(String[] args) {
		InnnerclassesDemo in=new InnnerclassesDemo();
		InnnerclassesDemo.Test it= in.new Test();
		it.m1();
		in.m2();
		in.m3();
	}

}

class Outer extends InnnerclassesDemo{
	
	
	public static void main(String[] args) {
		System.out.println("-------------- OUTER CLASS --------------");
		Outer o=new Outer();
		Outer.Test ot=o.new Test();
		ot.m1();
		
	}
		
	
	
}









