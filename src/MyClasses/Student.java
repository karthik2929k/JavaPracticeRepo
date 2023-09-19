package MyClasses;
import MyInterfaces.StudentService;

public class Student extends MyabstractDemo implements StudentService{
	
public Student(){
		
	}
	
	 public Student(int total){
		 super(total);
	 }
	public Student(String name, int age, int rollno, int marks, int telmarks, int hindimarks) {
		super(name, age, rollno, marks);
		this.telmarks = telmarks;
		this.hindimarks = hindimarks;
	}
	
	public static String namename;
	int telmarks;
	int hindimarks;
	public  String parentname(){
		return "Hello ";
}
	
	public  String parentname(String a){
			return "Hiiii "+a;
	}
	
	public static String Studentmarks(){
		//int totaolmarks;
		Student s=new Student("karthik",5,20,3,60,56);
	int totMarks=s.telmarks+s.hindimarks;
	Student s2= new Student(25);
	System.out.println("Age2===="+s2.getAge2());
	System.out.println("Total marks======"+s.name+"   "+totMarks);
		String total = s.getmarks();
		int val= s.getAge() + s.getHindimarks();
		return total+"   "+ val ;
	}
	private String getmarks() {
		// TODO Auto-generated method stub
		String result = null;
			int rollno = getRollno();
			
			result = getname();
		
		return result;
	}

	public static String getnamename() {
		return namename;
	}

	public static void setnamename(String namename) {
		Student.namename = namename;
	}

	public int getTelmarks() {
		return telmarks;
	}

	public void setTelmarks(int telmarks) {
		this.telmarks = telmarks;
	}

	public int getHindimarks() {
		return hindimarks;
	}

	public void setHindimarks(int hindimarks) {
		this.hindimarks = hindimarks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StudentService.i=20; //cant change interface varaiable 
		System.out.println(i);
		String strname;
		strname= "Karthik"; 
		namename="Hello "; 
		Student s=new Student();
		System.out.println(s.parentname("QQQQQQQQ"));
		System.out.println("local "+strname +"  global   "+ namename);
		Studentmarks();
		System.out.println(Studentmarks());
	}
	
	
	

}
