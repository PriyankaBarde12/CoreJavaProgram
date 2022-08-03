import java.util.Scanner;

public class Numberprog 
{
	public static void show(int n1)
	{
		/*String b="";
		
		while(n1>0)
		{
			int a=n1%2;
			b=a+b;
			n1=n1/2;
		}
		System.out.println(b);*/
		
		
		int binary;
		while(n1>0)
		{
			binary= n1%2;
			System.out.print(binary);
			n1=n1/2;
		}
	}

	public static void main(String[] args) 
	{
		
		/*int n=20;
		String s=Integer.toBinaryString(n);
		System.out.println(s);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		show(num);
		
		
	}

}
