package programs;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Integer i=12;
		Myclass<Integer> obj=new Myclass<>(i);
		System.out.println(obj.getobj());
		Float f=12.123f;
		Myclass<Float> obj1=new Myclass<>(f);
		System.out.println(obj1.getobj());*/
		Integer arr1[]={1,2,3,4,5};
		System.out.println("Integre objects");
		Myclass.display(arr1);
		String arr3[]={"raju","rani","ravi","kiran"};
		System.out.println("rading string objects");
		Myclass.display(arr3);
	}

}
class Myclass<T>
{
	/*T obj;
	Myclass(T obj)
	{
		this.obj=obj;
	}
	T getobj()
	{
				return obj;
		
	}*/
	static <T> void display(T[] arr)
	{
		for(T i:arr)
		{
			System.out.println(i);
		}
	}
}

