package selenium;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		
		int myNum = 5;
		String Website = "www.google.com";
		char letter = 'B';
		double dec = 5.90;
		boolean myCard = true;

		String firstName = "Bhawani";
		String lastName = " Singh";
		String fullname =firstName + lastName ;
		
		// Arrays ---Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		int [] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		
		int[] arr2 = {1,2,3,4,5,6,8,9,10,11,12};
//		System.out.println(arr2[1]);
		
//		System.out.println(fullname);
		
		//For loop arr.length -5
//		for(int i=0; i< arr.length; i++) //4
//		{
//		System.out.println(arr[i]);
//		}
		
		for (int i=0; i<arr2.length; i++) 
		{
			System.out.println(arr2[i]);
		}
	
		String[] name = {"Bhawani", "singh", "selenium"};
		
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
//		Enhanced for loop for declaratio
		for (String s:name)
		{
			System.out.println(s);
		}
	
	
	
	
	
	
	
	
	}
	
	}
	
