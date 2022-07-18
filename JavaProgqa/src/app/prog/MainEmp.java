package app.prog;

import java.util.Arrays;

//import app.prog.Employee;

public class MainEmp 
{
	int i;
	public void acceptDetails(Employee emp[])
	{
		emp[0]= new Employee(4 , 25000.0f ,"Riya");
		emp[1]= new Employee(5 , 65000.0f ,"Kamalesh");
		emp[2]= new Employee(6 , 35000.0f ,"Gauri");
		emp[3]= new Employee(7 , 70000.0f ,"Aman");
		emp[4]= new Employee(8 , 35000.0f ,"Pranav");
	}
	public void highSalary()
	{
		
	}
	public void showAbove(Employee emp[])
	{
		for( i=0;i<emp.length;i++)
		{
			/*float salary = emp[i].salary;
			if(salary > 60000.0f) {
				System.out.println(salary);}*/
		}
	}
	public void displayAverage()
	{
		
	}
	public void showSameSalary()
	{
		
	}
	public void display(Employee emp[])
	{
		System.out.println(Arrays.toString(emp));
	}
	

	public static void main(String[] args) 
	{
		Employee e[];
				e= new Employee[5];
		MainEmp  emp =new MainEmp ();
		emp.showAbove(e);
		emp.display(e);
		emp.acceptDetails(e);
	}

}
