package week3.day1;

public class StringReplaceConcat {

	public static void main(String[] args) {
		/*
		 * Write a Java program to replace a specified character with another character
		 * and add # to the given string.
		 * 
		 * String sentence = "I am working with Java8" replace 8 to 11 Print the
		 * characters from 5 to 14
		 */

		String sentence = "I am working with Java8";

		System.out.println("After replacing 8 = " + sentence.replaceAll("[\\d]", "11"));
		System.out.println("Characters from 5 to 14 = " + sentence.substring(5, 14));
	}

}
