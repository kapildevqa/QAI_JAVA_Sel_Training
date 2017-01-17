package class1;

public class Assignment2 {

	public static void main(String[] args)
	{
		double mealPrice = 12.0;
		int tipPrecent = 20;
		int taxPercent = 8;
		
		
		Double d = (mealPrice+(mealPrice*tipPrecent/100)+(mealPrice*taxPercent/100));
		
		System.out.println("totalCost = " + d);
	}
}
