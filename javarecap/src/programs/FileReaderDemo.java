package programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s= System.getProperty("user.dir")+"\\file.txt";
		String str;
		FileWriter fw=new FileWriter(s);
		System.out.println("Enter Data");
		while(!(str=br.readLine()).equals("exit"))
		{
			fw.write(str);
		}*/
		String s= System.getProperty("user.dir")+"\\file.txt";
		
		FileReader fr=new FileReader(s);
		String str2;
		BufferedReader by=new BufferedReader(fr);
		while((str2=by.readLine())!=null)
		{
			System.out.print(str2);
		}
		//fw.close();
		by.close();

	}

}
