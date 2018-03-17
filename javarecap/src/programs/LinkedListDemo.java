package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		LinkedList<String> l1=new LinkedList<String>();
		l1.add("America");
		l1.add("India");
		l1.add("Australia");
		l1.add("Japan");
		
		System.out.println("Enter position");
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String newElement=br.readLine();
		l1.add(n, newElement);
		l1.set(4, newElement);
		System.out.println(l1.getFirst()+" "+ l1.getLast()+l1.indexOf("India"));
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		Object[] a=l1.toArray();
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		LinkedList<String> hg=new LinkedList<String>();
		hg.addAll(l1);
		Iterator it=hg.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(hg.contains("India"));
		System.out.println(l1);
	}

}
