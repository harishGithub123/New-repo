package programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileBasicDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Dirpath");
		String dirpath=br.readLine();
		System.out.println("Enter dirname");
		String dname=br.readLine();
		File f=new File(dirpath,dname);
		if(f.exists())
		{
			String arr[]=f.list();
			int n=arr.length;
			for (int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
				File f1=new File(arr[i]);
				if(f1.isFile())System.out.println("it is file");
				if(f1.isDirectory())System.out.println("it is directory");
			}
			System.out.println("no of entries in the directory");
		}
		else System.out.println("no directories");

	}

}
