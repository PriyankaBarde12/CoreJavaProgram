
public class RecursionExmple 
{
	int sum=0 ;int n=5;
	public void add()
	{
		int i;
		
		for( i=0;i<=n;i++)
		{
			//sum=sum+i;
			
			System.out.println(sum=sum+i);
		}
		add();
		
	}

	public static void main(String[] args) 
	{
		RecursionExmple o = new RecursionExmple();
		o.add();
		
	}

}
