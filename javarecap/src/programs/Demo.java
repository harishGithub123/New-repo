package programs;

class Personn
{
	public String name="raju";
	public int age=22;
	/*Personn()
	{
		name="Raju";
		age=22;
	}
	Personn(String name,int age)
	{
		this.name=name;
		this.age=age;
	}*/
	void talk()
	{
		System.out.println("hello iam"+ name);
		System.out.println("My age is"+ age);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personn raju=new Personn();
		Personn sita=new Personn();
		raju.name="harish";
		sita.name="anushka";
		raju.talk();
		
		
		sita.talk();
		//Personn gopi=new Personn("gopi",15);
		//gopi.talk();

	}

}
