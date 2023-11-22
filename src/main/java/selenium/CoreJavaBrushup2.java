package selenium;

import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,8,9,10,11,12};
		
		//2,4,6,8,10

		//check if array has multiple of 2
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 ==0)
			{
				System.out.println(arr2[i]);
				// break; --------- that is work in break loop when condition is full
			}
			else 
			{
				System.out.println(arr2[i] +"is not multiple of 2");
			}
		}

		ArrayList<String> a = new ArrayList<String>();
		//create object of the class - object.method
		a.add("Bhawani");
		a.add("singh");
		a.add("selenium");
		a.add("pytosoft");
		System.out.println(a.get(3));

		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*************");
		for(String val : a)
		{
			System.out.println(val);
		}
		
		//item is present in Arraylist ------boolean value (True or False)
		System.out.println(a.contains("selenium"));

	}

}
