class ItemOverFlowException extends Exception
{
	

	public void checkStock() 
	{
		System.out.println("Item Stock is overflow");
	}
}
class ItemStockUnderFlowException extends Exception
{
	public void checkStock() 
	{
		System.out.println("Item Stock is Underflow");
	
	}
}

public class Store 
{
	int noItem=700;
	String itName="Pen";
	int minStock=10 ;
	int maxStock=800;
	public void addItem()
	{
	}
	public int removeItem(int noIte)
	{
		return noItem=noItem-noIte;
		
		
	}
	public int checkStock() throws ItemOverFlowException, ItemStockUnderFlowException
	{
		if(noItem<=maxStock)
			throw new ItemStockUnderFlowException();
		else
		
			throw new ItemOverFlowException();
			
		
		
	}
	public static void main(String[] args) {
		Store st =new Store();
		
			st.removeItem(200);
			try {
				st.checkStock();
			} catch (ItemOverFlowException e) {
				e.checkStock();
				
			}
			catch (ItemStockUnderFlowException e)
			{
				e.checkStock();
			}
			
			
		}
	}


