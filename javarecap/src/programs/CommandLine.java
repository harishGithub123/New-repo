package programs;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=args.length;
		String s="gheee.xlsx";
		System.out.println(s.indexOf("."));
		System.out.println(s.substring(s.indexOf(".")));
		
		System.out.println("args are");
        for(int j=0;j<i;j++)
        {
        	System.out.println(args[j]);
        }
	}

}
