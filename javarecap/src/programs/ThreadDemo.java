package programs;

public class ThreadDemo implements Runnable {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo obj1=new ThreadDemo("cut the ticket");
		ThreadDemo obj2=new ThreadDemo("show the ticket");
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
 
	}
     String str=null;
	
	ThreadDemo(String str)
	{
		this.str=str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(str+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
