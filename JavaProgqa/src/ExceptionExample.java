import java.util.Scanner;

public class ExceptionExample
{
	public void showString()
	{
		String str = "gdfj";
		//for(int i =0;i<str.length();i++)
		//{
			try 
			{
				System.out.println(str.charAt(6));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("please provide the correct string size");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
			}
		//}
		
	}

	public static void main(String[] args) {
		/* int arr[] = new int[5];
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[10]);
		 }
		 String s2 ="hellooo";
		 Object o=s2;
		// Integer i = (Integer) o;*/
		 // int a=Integer.parseInt("45adsd78");
		  
		 // Scanner sc =new Scanner(System.in);
		ExceptionExample excep =new ExceptionExample();
		excep.showString();
		  
	}

}
