package recursion;

import java.util.Scanner;

public class powerOfANumber {
	public static double power(double base, int exponent) {
		if (exponent == 1) {
			return base;
		}
		return base * power(base, exponent - 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base:");
		double b = scanner.nextDouble();
		System.out.println("Enter the exponent:");
		int e = scanner.nextInt();
		scanner.close();
		System.out.println("Output: " + power(b,e));
		

	}

}
