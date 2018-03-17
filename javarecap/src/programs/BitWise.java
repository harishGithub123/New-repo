package programs;

public class BitWise {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte x,y;
		x=10;
		y=11;
			System.out.println("x>>2:"+ (x>>2));
			System.out.println("x<<2:"+ (x<<2));
			System.out.println("x&y:"+ (x&y));
			System.out.println("x|y:"+ (x|y));
			System.out.println("x^y:"+ (x^y));
			System.out.println("~x:"+ (~(x)));
			
			int d=40;
			int c=50;
			int max;
			max=(d>c)?c:d;
			System.out.println(max);
		BitWise bt =new BitWise();
		boolean variable= bt instanceof BitWise;
		System.out.println(variable);
		int z=1;
		System.out.println("Before return");
		if(z==1)
		{
			return;
			
		}
		System.out.println("After return");
		
			
		

	}

}
