package de.zerocode.util;

public class Strings {
	public static void main(String[] args) {
		ReverseString reverse = new ReverseString();
		System.out.println("The given String is palindrome "+reverse.isPalindrome("OYo"));

		// By Using equals() Method
		String one = "Ravi";
		String two = "Ravi";
		String three = new String("Ravi");
		String four = "ravi";
		System.out.println(one.equals(two));
		System.out.println(one.equals(three));
		System.out.println(one.equals(four));
		System.out.println(one.equalsIgnoreCase(four));

		// By using compare() method
		System.out.println(one.compareTo(three));
		System.out.println(one.compareTo(four));
		System.out.println(four.compareTo(one));
		
		//By using concat() method
		String five = one.concat(four);
		System.out.println(five);
		
		//using startsWith() and endsWith()
		System.out.println(one.startsWith("Ra"));
		System.out.println(two.endsWith("vi"));
		
		// indexOf() and replace()
		System.out.println(one.indexOf('v'));
		one=one.replace('a', 'b');
		System.out.println(one);
	
		
	}

}
