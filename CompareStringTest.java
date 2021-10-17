package week3.day1;

public class CompareStringTest {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compare a given string to another string, ignoring
		 * case considerations.
		 * 
		 * String 1="I am Learning Java" String 2="I am learning java? Explore with ==
		 * operator equals equalsignorecase
		 */
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		
		if(str1==str2) {
			System.out.println("== operator returns true");
		}
		else if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("equalsIgnoreCase returns true");
		}
		else if(str1.equals(str2)==true) {
			System.out.println("equals returns true");
		}
		else {
			System.out.println("Str1 and Str2 are not equal");
		}
			

	}

}
