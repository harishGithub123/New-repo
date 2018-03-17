package programs;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		str.toCharArray();
		Character ch='A';
		int i=20;
		char c='1';
		System.out.println(ch);
		Integer in=new Integer(ch.toLowerCase(ch));
		Integer in1=new Integer(str);
		Integer in2=new Integer(i);
		Integer in3=i;
		String se=in2.toString();
		System.out.println(in);
		System.out.println(in.intValue());
		System.out.println(in1.valueOf(str));
		

	}

}
