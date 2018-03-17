package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import programs.CSE.CourseFees;

interface Fees{
	double showFees();
}

class CSE implements Fees
{

	@Override
	public double showFees() {
		// TODO Auto-generated method stub
		return 60000.00;
	}
	class ECE implements Fees
	{

		@Override
		public double showFees() {
			// TODO Auto-generated method stub
			return 50000.00;
		}
		
	}
	  class CourseFees{
		public static  Fees getFees(String course)
		{
			if(course.equalsIgnoreCase("CSE"))
			{
				return new CSE();
			}
			else if(course.equalsIgnoreCase("ECE"))
			{
				return new ECE();
			}
			else return null;
		}
	}
	
}
public class MyClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//CourseFees c=new CourseFees();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		Fees f=CourseFees.getFees(name);
		System.out.println("the fees is" + f.showFees());
	}

}
