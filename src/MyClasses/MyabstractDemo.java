package MyClasses;

public abstract class MyabstractDemo {
	
	String name;
	int age;
	int rollno;
	int marks;
	private int age2;
	
	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	public MyabstractDemo(int age2) {
		super();
		this.age2 = age2;
	}

	public MyabstractDemo(String name, int age, int rollno, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.marks = marks;
	}

	public MyabstractDemo(){
		
	}


	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void m1(){
		
		
	}

}
