package programs;

class InheritanceExample{
	
	void show()
	{
		System.out.println("hi super");
	}
	void show1()
	{
		System.out.println("super1");
	}

}
class InheritanceExampleSubclassDemo extends InheritanceExample
{
	void show()
	{
		System.out.println(" hi subclass");
	}
	void show2()
	{
		System.out.println("hi show2 subclass");
	}
	public static void main(String[] args)
	{
		InheritanceExample r;
		 r=new InheritanceExampleSubclassDemo();
		 InheritanceExampleSubclassDemo t=(InheritanceExampleSubclassDemo)InheritanceExample;
		r.show1();
	}
}
