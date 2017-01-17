package class1;

public class Person {
	
	int age;
	
	Person(int initialAge)
	{
		age = initialAge;
		if(age < 0)
		{
			age =0;
			System.out.println("Age is not valid, setting age to zero");
		}
	}
	
	public void yearpass()
	{
		age++;
	}
	
	public void amiold()
	{
		if (age>0 && age<13)
		{
			System.out.println("you are young");
		}
		else if (age>=13 && age<18)
		{
			System.out.println("you are teenager");
		}
		else if (age >= 18){
			System.out.println("you are old");
		}
	}

	public static void main(String[] args) {
		
		Person obj = new Person(-1);
		obj.amiold();
		
		for(int i=0;i<13;i++)
		{
		obj.yearpass();
		}
		obj.amiold();

	}

}
