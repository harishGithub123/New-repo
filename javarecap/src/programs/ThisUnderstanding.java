package programs;

public class ThisUnderstanding {
	int id;
	String name;
	String city;
	ThisUnderstanding()
	{
		System.out.println("default constructor");
	}
	ThisUnderstanding(int id,String name)
	{
		this();
		this.id=id;
		this.name=name;
		System.out.println(id+name);
		
	}
	ThisUnderstanding(int id,String name,String city)
	{
		this(id,name);
		System.out.println("fsjdf");
		
		//this.id=id;
		//this.name=name;
		this.city=city;
		System.out.println(id+name);
		
	}
	
	
	void display()
	{
		System.out.println("id"+id+" "+"name"+name+" "+"city"+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThisUnderstanding t=new ThisUnderstanding(111,"harish");
      ThisUnderstanding t2=new ThisUnderstanding(222,"kumar","hyd");
      t.display();
      t2.display();
	}

}
