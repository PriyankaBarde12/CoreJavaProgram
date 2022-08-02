
/*. Write a java code to add 'ing' at the end of a given string (length should be at least 3). If the given string already ends with 'ing' then add 'ly' instead. 
If the string length of the given string is less 
than 3, leave it unchanged. 
Sample String : 'abc'
Expected Result : 'abcing'
Sample String : 'string'
Expected Result : 'stringly'*/

package app.prog;
class Laptop
{
	String brand , os;
	double cost;
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String b)
	{
		brand =b ;
	}
	public String getOs()
	{
		return os;	
	}
	public void setOs(String o)
	{
		os =o;
	}
	public double getCost()
	{
		return cost;	
	}
	public void setCost(double c)
	{
		cost =c;
	}
	public void display()
	{
		System.out.println(brand+" , "+os+" , "+cost+" , ");
	}
	public String getString()
	{
		return brand;
	}	
}

class OperatingSystem  extends Laptop
{
	String osName , vendor ;
	double version ;
	OperatingSystem(String osName, String vendor ,double version)
	{
		this.osName =osName;
		this.vendor =vendor;
		this.version= version;
	}
	public void showOsDetails()
	{
		System.out.println("OS Name : "+osName+" Vendor : "+vendor+" version : "+version);
	}
	public static void main(String args[])
	{
		OperatingSystem system =new OperatingSystem("Window","ABC",10);
		system.setCost(40000);
		system.setBrand("HP");
		system.setOs("Linux");
		system.display();
		system.showOsDetails();
		system.setBrand("HP");
	}
}
