package programs;

abstract class Person{
	abstract void eat();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(){

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("fruits");
				
			}
			
		};
		p.eat();
		

			
			
		

	}

}
