package MyClasses;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Notes 
/*

[a-zA-Z0-9]-- Includes 
[^a-zA-Z0-9]-- except
\s --  finds space 
\S -- Ignores space 
\d -- any digit 
\D -- except digit 
\w -- any word charecter
\W -- except word char 
. -- Any charecter

*/
/*
 * 
Quantifiers

a -- exactly one a 
a+ -- atleast one a 
a* -- any no of a also zero 
a? -- atmost one a

*/	
/* 
mobil validation 

[0-9]{10} -- for ten digit number 
(0\\91)?[7-9][0-9]{9} -- 10 || 11 digit mobile number

abcs122ahga@gmail.com
[a-zA-Z0-9]@[a-zA-Z][.][a-zA-Z]
mail id validation 


mail id validation 
[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+

*/


public class RegexpressionPractice {
	
	private static String sentence=" Hello world This is karthik 546 from earth @gmail.com # says Goood Morning to all 1234567890  91333333333 33333333333";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 0;
		String name= "aabbaabbbabanaaajaababba ";
		Pattern p=Pattern.compile("a*");
		Matcher mm=p.matcher(name);
		while(mm.find()){
			count++;
			System.out.println(mm.start() +"  "+ mm.end() +"   "+ mm.group());
		}
		System.out.println(" -------------Quantifiers--------- ---------------- ");
		Pattern p2=Pattern.compile("(0\\91)?[7-9][0-9]{9}");
		
		
		Matcher mm2=p2.matcher(sentence);
		
		
		while(mm2.find()){
			count++;
		//	System.out.println(mm.start()+"    "+mm.end()+"     "+mm.group());
			System.out.println(mm2.start()+"    "+mm2.end()+"     "+mm2.group());
		}
		System.out.println("count  :: "+count);
		String mailid="kaahg90_@gmail.com";
		Pattern p4=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
		Matcher mailvalid=p4.matcher(mailid);
		while(mailvalid.find()){
			System.out.println("Valid "+mailvalid.group());
			count++;
		}
		
		System.out.println("-------------StringTokenizer-----------------");
		String mail="www.nnnnnnaaa.com.org.co. in";
		StringTokenizer st=new StringTokenizer(mail);
		Pattern p3=Pattern.compile(".");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		String number="9100002344";
		Matcher inputmn=p2.matcher(number);
		
		if(inputmn.find() && inputmn.group().equals(number)){
			System.out.println("Vlid no ");
		}
		
		System.out.println(RegexpressionPractice.filewithNumbers());
					System.out.println(RegexpressionPractice.FileReaderExample());
	}
	
	
	public static String filewithNumbers() throws IOException{
		
		System.out.println("---------------------- About FILE  ------- in FileIO------------ ");
		File f=new File("D:\\FileIO");
		System.out.println(f.exists());
		f.mkdir();
	//	File ff=new File("D:\\FileIO","newfile.txt"); both will have same impact 
		File ff=new File(f,"newfile.txt");
		System.out.println(ff.exists());
		if(!ff.exists()){
			ff.createNewFile();
		}
		FileWriter fw=new FileWriter(ff,true);
		for(int i=0;i<=10;i++){
			fw.write("Karthik good orning !");
			fw.write("\n");
		}
		fw.flush();
		fw.close();
		
		String path="C:\\Users\\karthik.penchala\\Documents\\Karthik_V2_App_prep";
		File lookup=new File(path);
		int nooffiles=0;
		int noofDirs=0;
		if(f.isDirectory()){
			String[] s1=lookup.list();
			System.out.println(s1);
			for(String s:s1){
				File files=new File(lookup,s);
				if(files.isFile()){
					nooffiles++;
					System.out.println("file name  " +s);
				}else if(files.isDirectory()){
					noofDirs++;
					System.out.println("Dir name "+s);
				}
			}
			System.out.println("count of files   "+nooffiles+"count of Dirs "+noofDirs );
		}
		
		return "END OF filewithNumbers ";
	}
	
	public static String FileReaderExample() throws IOException{
		
		
		FileReader fr=new FileReader("D:\\abc.txt");
		int i=fr.read();
		while(i != -1){
			System.out.print((char) i );
			i=fr.read();
		}
		fr.close();
		
		System.out.println("-------------BUFFERED READER ---------");
		File f=new File("D:\\FileIO", "newfile.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String line=br.readLine();
		ArrayList<String> al=new ArrayList<>();
		while(line!=null){
			System.out.println("Line is "+line);
			al.add(line);
			line=br.readLine();
		}
		br.close();
		System.out.println(al);
		
		return "END OF FileReaderExample";
	}

}
