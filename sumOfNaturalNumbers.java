package recursion;

import java.util.Scanner;

public class sumOfNaturalNumbers {
	
	public static int summation(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n + summation(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Input: ");
		int x = scanner.nextInt();
		System.out.println("Output:" + summation(x));
		scanner.close();

	}

}
