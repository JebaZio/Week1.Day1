package week3.day1;

public class StringComparison {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text - Because it compares the memory location of the Strings");
		 
		 System.out.println("*****");

	}

}
