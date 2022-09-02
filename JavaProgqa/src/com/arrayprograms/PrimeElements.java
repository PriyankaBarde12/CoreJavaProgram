package com.arrayprograms;

public class PrimeElements {

	public static void showw()
	{
		
	}
	public static void main(String[] args) {
		for(int i=2;i<20;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
			}
			 if(count==0) {
				 System.out.println(i);		
			 }
				
		}
		showw();
		/*int a[]= {21 ,3 ,5,6,7,8,17,11,24,13};
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=2 ;j<a.length;j++)
			{
				if(a[i]%j == 0)
					count++;		
			}
			
			if(count == 0)
				System.out.print(a[i]+" ");
		}*/

	}

}
