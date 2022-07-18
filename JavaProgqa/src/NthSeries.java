import java.util.Scanner;

public class NthSeries 
{

	public static void main(String[] args) 
	{
		int i ,n ,term, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of term");
		n = sc.nextInt();
		System.out.println("Number Series ..........");
		for( i =1 ;i<=n;i++)
		{
			term =(i*i)-1;
			sum =sum+term;
			System.out.print(term+" ");
		}
		System.out.println();
		System.out.println("Series sum : "+sum);
				
	}

}
