import java.util.ArrayList;

public class ArrayList11 
{
	public void add11(ArrayList<String>l)
	{
		l.add("vbhdfkj");
		l.add("dshj");
		reverseDisplay(l);
	}
	
	
	 void reverseDisplay(ArrayList<String> l) {
		
		 System.out.println("........reverse");
		 for(int i=l.size()-1;i>=0;i--)
			{
				System.out.println(l.get(i));
			}
				
		
	}

	public static void main(String[] args)
	{
		
		ArrayList<String> l=new ArrayList<>();
		ArrayList11 o= new ArrayList11();
		
		o.add11(l);
	
		//o.reverseDisplay(l);
	//	o.add(l);
		//o.reverseDisplay(l);
	}

}
