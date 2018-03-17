package programs;

public class GarbageCollector {
	
	public void finalize()
	{
		System.out.println("garbage colleted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector gc1=new GarbageCollector();
		GarbageCollector gc2=new GarbageCollector();
		gc1=null;
		gc2=null;
		System.gc();
		

	}

}
