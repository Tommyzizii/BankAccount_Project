package recursion;

import java.util.Scanner;

public class factorial {
	
	public static int factorial(int n) {
		if (n == 1){
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input: " );
		int x = scanner.nextInt();
		
		System.out.println("Output: " + factorial(x));
		scanner.close();

	}

}
