package recursion;

import java.util.Scanner;

public class fibonacciSequence {
	
	public static int fibonancci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		return fibonancci(n-1) + fibonancci(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Input: ");
		int x = scanner.nextInt();
		System.out.println("Output:" + fibonancci(x));
		scanner.close();

	}

}
