package programs;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			DataInputStream dis=new DataInputStream(System.in);
			String s= System.getProperty("user.dir")+"\\file.txt";
			FileOutputStream fos=new FileOutputStream(s,true);
			BufferedOutputStream bout=new BufferedOutputStream(fos,1024);
			System.out.println("Enter text(@ at the end)");
			char ch;
			while((ch=(char)dis.read())!='@')
			{
			bout.write(ch);	
			}
			FileInputStream fis=new FileInputStream(s);
			int ch2;
			while((ch2=fis.read())!=-1)
			{
				System.out.print((char)ch2);
			}
			bout.close();
	}

}
