package LessonThird;

import java.util.Scanner;

public class MyClass {
	/*
	 *  Example program for how to input data from user in Java
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some number: ");
		int user_input_int = scan.nextInt();
		
		System.out.println("The entered number: ");
		System.out.print(user_input_int);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter some decimal value: ");
		double user_input_decimal = scan1.nextDouble();
		
		System.out.println("The entered decimal value: ");
		System.out.print(user_input_decimal);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter some string value: ");
		String user_input_string = scan2.nextLine();
		
		System.out.println("The entered string value: ");
		System.out.print(user_input_string);
		
		

	}

}
