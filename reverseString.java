package recursion;

import java.util.Scanner;

public class reverseString {
	public static String reverseString (String n) {
		if (n.length() <= 1) {
			return n;
		}
		
		int half = n.length() / 2; 
		String front = reverseString(n.substring(0,half));
		String end = reverseString(n.substring(half));
		
		return end + front;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Input: ");
		String x = scanner.next();
		System.out.println("Output:" + reverseString(x));
		scanner.close();
	}

}
