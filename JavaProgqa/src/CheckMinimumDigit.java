
public class CheckMinimumDigit 
{
	public static void display(int num)
	{
		//451
		int min =num%10,sum=0,r;
		while(num>0)
		{
			r=num%10;
			//if(min>r)
				//min=r;
				sum=sum+r;
			num=num/10;
			
		}
		System.out.println(sum);
	}
	
	public static void checkNum()
	{
	int n=45678, sum=0;
		int r , min=n%10;
		while(n>0)
		{
			r =n%10; 
			if(min>r)
			min=r;
			//sum=sum+r;
			n=n/10;
		}
		System.out.println("Smallest number is : "+min);
		//System.out.println(sum);
	}
	public static void main(String args [])
	{
		checkNum();
		display(7235);
	}

}
