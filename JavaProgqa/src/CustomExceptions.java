class MobileException extends Exception
{
	public void show()
	{
		System.out.println("Generate mobile Exceptions");
	}
}


public class CustomExceptions
{
	public void display(String n2) throws MobileException
	{
		
		if(n2.matches("[0-9] {10}"))
			System.out.println("Mobile num "+n2);

		else
			throw new MobileException();
	}

	public static void main(String[] args)
	{
		 CustomExceptions c=new  CustomExceptions();
		 String n ="8805221199";
		 
		 try
		 {
			 c.display(n);
		 }
		 catch(MobileException m){
			 m.show();
		 }
	}

}
