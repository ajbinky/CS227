package lab4;

import java.util.Scanner;

public class NumberPower {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = help(in);
		int y = help(in);
		int result = (int) Math.pow(x,y);
		System.out.println(result);
		
		in.close();
	}
	
	private static int help(Scanner scan) {
		
		System.out.println("Enter a number: ");
		if (scan.hasNextInt()) {
			return scan.nextInt();
		} else {
			return 1;
		}
	}
	
}
