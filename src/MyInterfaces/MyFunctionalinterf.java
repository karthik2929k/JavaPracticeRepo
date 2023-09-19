package MyInterfaces;

@FunctionalInterface
public interface MyFunctionalinterf {
	
	public int m1(int a, int b);
	default void m2(){
		System.out.println("karthik !");
	}
	public static void  m3() {
		System.out.println("good morning !");
	}

}
