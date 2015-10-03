package LessonFifth;

public class MyClass {
/*
 * Example for how to use Increment and Assignment operator for Java program
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int z = 30;
		int v = 40;
		int m = 50;
		int n = 50;
		x = x + 1;
		y++;
		n = n + 5;
		m += 5;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z++); 
		//Because of the increasing value of the variable, 
		//will take effect next time you use (post increment)  
		System.out.println(z);
		// Because of the increasing value of the variable,
		//happens before use (pre increment)
		System.out.println(++v); 
		System.out.println(n);
		// This value is increasing in terms of the code,
		//more elegant.
		System.out.println(m); 
		
	}

}
