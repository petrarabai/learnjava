package LessonFourth;

public class MyClass {
	/*
	 * Example program how to use Math and Arithmetic operators in Java.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		double answer_plus, answer_minus, answer_remainder; 
		double answer_multiplication, answer_division;
		
		x = 500;
		y = 30;
		
		answer_plus = x+y;
		answer_minus = x-y;
		answer_multiplication = x*y;
		answer_division = x/y;
		answer_remainder = x%y;
		
		System.out.println("X+Y equal:");
		System.out.println(answer_plus);
		
		System.out.println("X-Y equal:");
		System.out.println(answer_minus);
		
		System.out.println("X*Y equal:");
		System.out.println(answer_multiplication);
		
		System.out.println("X/Y equal:");
		System.out.println(answer_division);
		
		System.out.println("X%Y equal:");
		System.out.println(answer_remainder);

	}

}
