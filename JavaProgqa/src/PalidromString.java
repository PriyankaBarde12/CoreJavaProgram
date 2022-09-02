import java.util.Scanner;

public class PalidromString 
{
	
	public void checkString(String s)
	{
		String rev = "";
		for(int i =s.length()-1 ;i>=0 ; i--)
		{
			rev = rev + s.charAt(i);		
		}
		if(s.equals(rev))
		{
			System.out.println("String is palidrome");
		}
		else 
		{
			System.out.println("String is not palidrom");
		}
	}
	public void checkNumber(int n)
	{
		int r;
		int sum=0,temp;     
		  temp=n; 
		  
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10; 
		   
		  // int i =(int) 34.6f;
		  // float i =(float) 23.1;
		  }    
		  if(temp==sum)    
		   System.out.println("This is palindrome number ");    
		  else    
		   System.out.println("This is not palindrome num"); 	  
	}
	public static void show(int no)
	{
		//78568
		int sum =0,r;
		int temp=no;
		while(no>0)
		{
			r=no%10;
			sum=(sum*10)+r;
			no=no/10;
		}
		if(temp==sum) {System.out.println("panindrom");}
		else {System.out.println("not palindrom");}
	}
	
	public static void main(String[] args) 
	{
		PalidromString  obj = new PalidromString ();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter any string");
		String s= sc.next();
		obj.checkString(s);
		System.out.println("Enter number here");
		int n =sc.nextInt();
			obj.checkNumber(n);	
			sc.close();
			show(121);
	}


}
