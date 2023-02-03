package de.zerocode.vehicle;

public class NumberToWord {

	public static final String[] UNITS = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] TENS = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	/**
	 * this method will returns the given number to word from 1 to 100 hundred crore
	 * @author sujwal b
	 * @since 2022-12-18
	 * @param number
	 * @return words 
	 */
	public static String numberToWord(int number) {
		if (number < 20)
			return UNITS[number];
		else if (number < 100)
			return TENS[number / 10] + " " + UNITS[number % 10];
		else if (number < 1000)
			return UNITS[number / 100] + " Hundred" + " " + numberToWord(number % 100);
		else if (number < 100000)
			return numberToWord(number / 1000) + " Thousand" + " " + numberToWord(number % 1000);
		else if (number < 10000000)
			return numberToWord(number / 100000) + " Lakh" + " " + numberToWord(number % 100000);

		return numberToWord(number / 10000000) + " Crore" + " " + numberToWord(number % 10000000);
	}

	public static void main(final String[] args) {
		System.out.println(numberToWord(1000000000));
	}
}
