package MyClasses;

enum DAYS{
	MON,FRI;
}
public class EnumsDemo {
		
	enum Months{
		JAN,FEB,DEC;
	}
	
	public static void main(String[] args) {
		
		Months m=Months.FEB;
		System.out.println(m);
		System.out.println(DAYS.MON);
		
	}
	
}


