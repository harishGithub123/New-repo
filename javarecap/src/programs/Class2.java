package programs;

class Class1 {
	
	public static void main(String[] args)
	{
		for(String s:args)
		{
			System.out.println(s);
		}
	}

}

public class Class2
{
	public static void main(String[] args)
	{
		String name[]={"harish","kumar","ECE"};
		Class1.main(name);
	}
}
