package MyClasses;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class Demoproperties {
	
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try
		{
			Properties p = new Properties();
			FileInputStream fis=new FileInputStream("D:\\abc.txt");
			p.load(fis);
			String name=p.getProperty("name");
			System.out.println(name);
			fis.close();
		}// end of try
		
		catch (IOException e) {
            e.printStackTrace();
        }
	}

}
