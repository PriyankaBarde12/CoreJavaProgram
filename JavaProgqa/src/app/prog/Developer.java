package app.prog;
public class Developer extends Application
{
	public Developer() 
	{
		super(7.4, "PHP");
	}
	public void install(String f)
	{
		System.out.println("Application version : "+version+" Technology : "+technology+" Founder : "+f);;
	}
	public void uninstall()
	{
		System.out.println("Uninstall the application ");
	}
	
	public static void main(String args[])
	{
		DesktopApplication desk = new DesktopApplication();
			desk.install("James Gosling");
		WebApplication web = new WebApplication();
			web.install("ABC");
		MobileApplication mob = new MobileApplication();
			mob.install("XYZ");
			double s;
			Application app =new Application(788.00 ,"bbbbbb");
			app.displayContainment();
	//	Developer develop = new  Developer();
		//	 develop.install("abc");
			// develop.uninstall();
		
	}

}
