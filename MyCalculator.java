package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println("Sum = " + cal.add(20, 50, 30));
		
		System.out.println("Subtraction = " + cal.sub(20, 40));
		
		System.out.println("Multiplication = " + cal.mul(5, 5));
		
		System.out.println("Division = " + cal.divide(25, 5));

	}

}
