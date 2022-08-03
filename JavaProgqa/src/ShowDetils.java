/*
 . Consider class Person having properties fullName,middleName, surname and gender. Create Person Object and accept data for it.                              [8]

a. Display  person’s  full name in such a way that, if gender is male then
Prefix to full name should be ‘Mr.’ , if gender is female then prefix to full name should be ‘Mrs.’.
Eg. If Person object is with data [ Ravi, Madhav,Shirke, male] then, It should be displayed like ‘Mr.Ravi Madhav Shirke’  

b. Store full name displayed in Q6 (a) in String . Display Name with initials like
Mr.R.M.Shirke
  
c. Replace Surname ‘Shirke’ with ‘Shikre’  from full name.
d. Create Array of 5 Person type objects and sort it in descending order of surname.

 */
class Person
{
	String fName ,surname ,midName,gender;
	public Person(String s,String mid,String sur,String g)
	{
		fName=s;
		midName =mid;
		surname = sur;
		gender = g;
		
	}
	public void acceptData()
	{
			System.out.println("Person : "+fName+" "+midName+" "+surname+" ");
	}
	public void display()
	{
		if(gender=="male")
		{
			System.out.println("Mr."+fName+" "+midName+" "+surname);
		}
		else 
		{
			System.out.println("Mrs."+fName+" "+midName+" "+surname);
		}
	}
}
public class ShowDetils
{
	public static void main(String[] args)
	{
		Person p =new Person("Riya","Manoj","Shirke","female");
		p.display();
	}

}
