package app.prog;
class Application 
{
	double version;
	String technology;
	 Developer obj;
	public Application(double version,String technology)
	{
		this.version =version;
		this.technology = technology;
		this.obj =obj;
	}
	public void displayContainment()
	{
		obj = new Developer();	
	}
}
class DesktopApplication extends Application
{
	public DesktopApplication() 
	{
		super(1.8, "Java");
	}
	public void install(String founder)
	{
		System.out.println("DesktopApplication version : "+version+" Technology : "+technology+" Founder : "+founder);;
	}
}
class WebApplication extends Application
{
	public WebApplication() 
	{
		super(3.141, "Selenium");
	}
	public void install(String founder)
	{
		System.out.println("WebApplication version : "+version+" Technology : "+technology+" Founder : "+founder);;
	}
}
class MobileApplication extends Application 
{
	public MobileApplication() 
	{
		super(5.3, "HTML");
	}
	public void install(String founder)
	{
		System.out.println("MobileApplication version : "+version+" Technology : "+technology+" Founder : "+founder);;
	}
	
}
