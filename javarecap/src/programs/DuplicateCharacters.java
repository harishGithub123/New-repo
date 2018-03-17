package programs;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Programming";
		String s1;
		Character ch;
		int count;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			count=0;
			for(int j=0;j<s.length();j++)
			{
				if(j<i&& ch==s.charAt(j))
				{
					break;
				}
				if(s.charAt(j)==ch)
				{
					count++;
				}
				if(j==(s.length()-1))
				{
					System.out.println(ch+" "+count);
				}
			}
			
			if(count>1)
			{
					s=s.replace(ch.toString(),"");
					//System.out.println(s);
			}
			
		}
		System.out.println(s.trim());
	}

}
