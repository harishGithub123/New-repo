package programs;

//enum Colors_enum{red,green,blue}
enum Chocolates
{
	dairymilk(20),
	kitkat(10),
	munch(5);
	int cost;
	Chocolates(int cost)
	{
		this.cost=cost;
	}
	
}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Colors_enum colors[]=Colors_enum.values();
		System.out.println(Colors_enum.green);
		for(Colors_enum c:colors)
		{
			System.out.println(c);
		}*/
		Chocolates fav=Chocolates.dairymilk;
		System.out.println(fav);
		/*switch(fav)
		{
		case dairymilk: System.out.println("Dairy Milk");
							break;
		case kitkat:System.out.println("kitkat");
		             break;
		case munch: System.out.println("munch");
		            break;
		}*/

	}

}
