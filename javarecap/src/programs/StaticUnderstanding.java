package programs;

public class StaticUnderstanding {
	
	int id;
	String name;
	static String clg="vasavi";
	
	StaticUnderstanding(int id1,String namee,String clgg)
	{
		id=id1;
		name=namee;
		clg=clgg;
	}
	static void change()
	{
		clg="cbit";
		System.out.println("ststic called"+clg);
	}
	void display()
	{
		System.out.println("id"+" "+id+" "+"name"+name+" "+"clg"+clg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticUnderstanding s=new StaticUnderstanding(111,"harish","kumar");
		s.display();
        StaticUnderstanding s2=new StaticUnderstanding(222,"kumar","kgfgj");
        //change();
        
        s2.display();
        s.display();
	}

}
