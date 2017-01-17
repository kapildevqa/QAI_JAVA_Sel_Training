package JAVAT;

/*public class Testarray {

	public static void main(String args[]) {

		int a[] = { 33, 3, 4, 5 };// declaration, instantiation and
									// initialization

		// printing array
		for (int i = 3; i >= 0; i--)// length is the property of array
			System.out.println(a[i]);

	}
}*/
/*---------------------------------------------------------------
class Testarray {
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			System.out.println("Max value");
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println(min);
	}

	public static void main(String args[]) {

		int a[] = { 37, 33, 35, 5 };
		min(a);// passing array to method

	}
}
*/

class Testarray{  
public static void main(String args[]){  
  
//declaring and initializing 2D array  
int arr[][]={{1,2},{2,4},{4,4,5}};  
  
//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
  
}}




