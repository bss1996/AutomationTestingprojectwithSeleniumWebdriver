package selenium;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is an object---Strings are used for storing text.
		//A String variable contains a collection of characters surrounded by double quotes:
		
		String s1= "Bhawani singh pytosoft";
		String s5= "Hello";
		
		//new
		String s2= new String("Welcome");
		String s3= new String("Welcome");

		String s = "Bhawani singh pytosoft";
		String[] splittedStrings = s.split("singh");
		System.out.println(splittedStrings[0]);
		System.out.println(splittedStrings[1]);
		System.out.println(splittedStrings[1].trim());
//		for(int i=0;i<s.length();i++)
		for(int i=s.length()-1;i<s.length();i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
		
		
	}

}
