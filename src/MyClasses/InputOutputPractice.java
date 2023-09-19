package MyClasses;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputOutputPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello There");
		
		// Hash Map Example 
		HashMap<String, String> m=new HashMap<>();
		Integer age = 25;
		
		m.put("name", "karthik");
		m.put("age", age.toString());
		m.put("Company", "VIDAL HEALTH");
		
		System.out.println("hash map is :: "+m);
		
		Student s=new Student();
		System.out.println(s.toString());
		
		
	}

}
