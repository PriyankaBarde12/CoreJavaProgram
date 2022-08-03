
enum Softy
{
	VANILLA(40, 1),MANGO(100, 2),BUTTERSCOTCH(80, 5);
	int price;
	int quatity;

	Softy(int p,int q)
	{
		price=p;
		quatity =q;
	}
}

public class IceCreamParlour
{

	public static void main(String[] args) 
	{
	
		
		Softy s =Softy.MANGO;
		switch(s)
		{
		case VANILLA :System.out.println("Total bill of VANILLA "+s.price*s.quatity);
		break;
		case MANGO :System.out.println("Total bill of Mango : "+s.price*s.quatity);
		break;
		case BUTTERSCOTCH :System.out.println("Total bill of BUTTERSCOTCH : "+s.price*s.quatity);
		break;
		
		}
	}

}
