import java.util.Scanner;

public class StringFun {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String s , otherString , subString ;
		System.out.println("Enter a String: ");
		s = input.nextLine();

		System.out.println("Enter another String:");
		otherString = input.nextLine();

		System.out.println("Enter a subString from the first String:");
		subString = input.nextLine();

		System.out.println(s.length());
   		System.out.println(s.equals(otherString));
    	System.out.println(s.substring(0,4));
    	System.out.println(s.trim());
    	System.out.println(s.indexOf(subString));
    	System.out.println(s.lastIndexOf(subString));
    	System.out.println(s.charAt(2));
    	System.out.println(s.endsWith("f"));
    	System.out.println(s.toUpperCase());

    	/**
    	*1) s.endsWith() will return true or false depending on if the string called s 
    	ends with the string inside the bracket of s.endswith(). if yes then true or else it will return false.
    	2) s.toUpperCase() turns the string to all capital letters.
    	*/

    	

  }
}