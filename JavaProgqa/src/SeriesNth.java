
public class SeriesNth 
{
	public int nthTerm(int a ,int r,int n)
	{
		int aA =a*power(r,n);
		return aA;
	}

	int power(int r, int n) 
	{
		int power =1;
		for(int i=1;i<n ;i++)
		{
			power =power*r;
		}
		
		return power;
	}

	public static void main(String[] args) 
	{
		SeriesNth series = new SeriesNth();

		series.nthTerm(2, 2, 4);
		series.power(2, 4);
	}

}
