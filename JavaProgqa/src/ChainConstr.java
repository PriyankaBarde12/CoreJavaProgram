
public class ChainConstr 
{
	 int rollno;
	 int age ; String name ;float salary;

	public ChainConstr()
	{
		this(2,"ABC",23444.0f);
		age=24;
		name="Priyanka";
	}
	ChainConstr(int age , String name ,float salary)
	{
		this(34);
		this.age=age;
		this.name=name;
		this.salary=salary;	
	}
	ChainConstr(int rollno)
	{
		this.rollno=rollno;
	}
	public void display()
	{
		System.out.println("Name "+name+"age"+age+"Salary"+salary+"Rollno"+rollno);
	}
	public static void main(String[] args)
	{
		ChainConstr c=new ChainConstr();
		c.display();
		//c1= new ChainConstr
	}

}
