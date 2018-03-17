package programs;

public class OuterClass {
 private int data=30;
 static int d=40;
  
 
 class InnerClass
 {
	 void msg()
	 {
		 int i=35;
		 System.out.println(data);
		 //display();
		 data=i;
		 System.out.println(data);
		 System.out.println(d);
		 d=i;
		 
	 }
 }
 void display()
 {
	 
	 
	 InnerClass in=new InnerClass();
	 in.msg();
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		OuterClass ot=new OuterClass();
		ot.display();
		
		System.out.println(ot.data+" "+d);

	}

}
