package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EmpList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int id;
		String name;
		String address;
		ArrayList<Employee> ar1=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter id");
			id=Integer.parseInt(br.readLine());
			System.out.println("Enter name");
			name=br.readLine();
			System.out.println("Enter address");
			address=br.readLine();
			Employee obj=new Employee(id,name,address);
			ar1.add(obj);
			
			
		}
		System.out.println("Enter id to search");
		id=Integer.parseInt(br.readLine());
		boolean found=false;
		for(int i=0;i<ar1.size();i++)
		{
			Employee obj=ar1.get(i);
			if(id==obj.id)
			{
				obj.display();
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("Employee are not found");
		}

	}

}
class Employee
{
	int id;
	String name;
	String address;
	Employee(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Nmae: "+name);
		System.out.println("Address: "+address);
	}
}

