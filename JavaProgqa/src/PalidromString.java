import java.util.Scanner;

public class PalidromString 
{
	Scanner sc = new Scanner(System.in);
	public void checkString()
	{
	String s  = "";
	String rev = "";
	System.out.println("Enter string");
	s= sc.nextLine();
	for(int i =s.length()-1 ;i>=0 ; i--)
	{
		rev = rev + s.charAt(i);		
	}
	if(s.equals(rev))
		System.out.println("String is palidrome");
	else
		System.out.println("String is not palidrom");
	}
	public void checkNumber()
	{
		int r;
		int sum=0,temp;    
		  int n=451;   
		  temp=n; 
		  
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10; 
		   
		  // int i =(int) 34.6f;
		  // float i =(float) 23.1;
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 
	}

	public static void main(String[] args) 
	{
		PalidromString  obj = new PalidromString ();
		//obj.checkString();
		obj.checkNumber();

	}


}
