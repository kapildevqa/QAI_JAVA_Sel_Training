package class1;

public class Assignment3 {

	public static void main(String[] args) {
		int n;
		for (n=2;n<=22;n++)
		{
		if(n % 2 == 1)
		{
			System.out.println("Weird 1");
		}
		
		else if (n % 2 == 0 && n > 2 && n < 5) 
			
			{
				System.out.println("Not Weird1");
			}     
		 else if (n % 2 == 0 && n > 6 && n < 20) 
		 {
			System.out.println("Weird2");
		}

		else if (n % 2 == 0 && n > 20) {
			System.out.println("Morethan 20");
		}
	}

}
}
