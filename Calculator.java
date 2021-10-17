package week3.day1;

public class Calculator {
	public void add(int x,int y, int z) {
		int sum = x+y+z;
		System.out.println("sum of x,y amnd Z = " + sum);
	}
	public void add(int x, int y) {
		int sum = x+y;
		System.out.println("Sum of x and y = " + sum);

	}
	public void multiply(int x, int y) {
		int prod = x*y;
		System.out.println("Product of x and y = " + prod);
	}
	public void multiply(int x, double y) {
		double prod = x*y;
		System.out.println("Product of x and  double y = " + prod);
	}
	public void subtract(int x, int y) {
		int diff = x-y;
		System.out.println("Difference of x and y = " + diff);
	}
	public void subtract(int x, double y) {
		double diff = x-y;
		System.out.println("Difference of x and  double y = " + diff);
	}
	public void div(int x, int y) {
		int quo = x/y;
		System.out.println("Quotient of x and y = " + quo);
	}
	public void div(double x, int y) {
		double quo = x/y;
		System.out.println("Quotient of x and  double y = " + quo);
	}
	
	public static void main(String args[]) {
		Calculator cal = new Calculator();
		cal.add(10, 20);
		cal.add(10, 20, 30);
		
		cal.subtract(50, 40d);
		cal.subtract(60, 20);
	
		cal.multiply(10, 12d);
		cal.multiply(10, 50);
		
		cal.div(20d, 5);
		cal.div(60, 20);
	String s = "welcome";

	
	}
	
	
	
	
	
}
