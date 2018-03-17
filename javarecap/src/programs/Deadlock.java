package programs;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object train =new Object();
		Object comp=new Object();
		BookTicket obj1=new BookTicket(train, comp);
		CancelTicket obj2=new CancelTicket(train, comp);
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t1.getName()+"....."+t2.getName());
		System.out.println(t1.getPriority()+"......."+t2.getPriority());

	}

}
class BookTicket extends Thread
{
	Object train,comp;
	BookTicket(Object train,Object comp)
	{
		this.train=train;
		this.comp=comp;
	}
	
	public void run()
	{
		synchronized (train) {
			System.out.println("BookTicket locked on train");
			try
			{
				Thread.sleep(150);
			}
			catch(InterruptedException e){}
			System.out.println("booktickets waiting to lock compartment object");
			synchronized (comp) {
				System.out.println("book tickets locked as compartment");
			}
		}
	}
}
class CancelTicket extends Thread
{
	Object train,comp;
	CancelTicket(Object train,Object comp)
	{
		this.train=train;
		this.comp=comp;
	}
	
	public void run()
	{
		synchronized (train) {
			System.out.println("cancelticket locked on comp");
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e){}
			System.out.println("cancelticket waiting to lock train object");
			synchronized (comp) {
				System.out.println("cancel tickets locked as train");
			}
		}
	}
}

