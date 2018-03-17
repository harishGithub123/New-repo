package programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c=0;
			//x=[abc];
			/*Pattern p=Pattern.compile("[0-9][0-9][.][0-9][0-9]");
			Matcher m=p.matcher("81 : (1,53.38,$45) (2,88.62,$98) (3,78.48,$3) (4,72.30,$76) (5,30.18,$9) (6,46.34,$48)");
			while(m.find())
			{
				//c++;
				
				System.out.println(m.start()+"...."+m.end()+"..."+m.group());
			}*/
			//System.out.println(c);
		String s="abaaacaaad";
		StringBuffer sb=new StringBuffer(s);
		Pattern p =Pattern.compile("a?");
		Matcher m=p.matcher(s);
		while(m.find())
		{
		    System.out.println(m.start()+"   "+m.end()+"  "+m.group());	
		   String s1=s.substring(m.start(), m.end());
		   System.out.println(s1);
		   sb=sb.replace(m.start(), m.end()," ");
		   System.out.println(sb);
		   
		   
		}
		
	}

}
