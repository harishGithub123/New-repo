package programs;

public class StringUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr={'H','A','R','I','S','H'};
		String s1=new String(arr);
		String s2=new String(arr,2,3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.charAt(0));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.indexOf(s2));
		System.out.println(s1.substring(1,3));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		String s3="Hello this this book new";
		String s5="Harish";
		char arr2[]=new char[50];
		s3.getChars(5, 24, arr2, 0);
		char[] s4=s3.toCharArray();
		System.out.println(s3);
		System.out.println(arr2);
		for(int i=0;i<s4.length;i++)
		{
			System.out.println(s4[i]);
			System.out.println(arr2[i]);
		}
		
	}

}
