package recursion;

import java.util.Scanner;

public class sumOfDigits {
	 
	public static int sumOfDigits(int n) {
		if (n < 10) {
			return n;
		}
		return sumOfDigits(n % 10) + sumOfDigits(n / 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Input: ");
		int x = scanner.nextInt();
		System.out.println("Output:" + sumOfDigits(x));
		scanner.close();

	}

}
