package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 
		 * 2) Pick the 2nd element
		 * from the last and print it
		 */
		 Arrays.sort(data);
		 System.out.println("Ascending Order of an Array ");
		 for(int i=0;i<data.length;i++) {
		 System.out.println(data[i]);
		 }
		 System.out.println("Second Element from the last =" + data[data.length-2]);
		 
	}

}
