package lab3;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random rand = new Random(137);
		
		for (int i = 1; i <= 500; i++) {
			if (i%10 == 0) {
				System.out.println("\n");
			}
			System.out.print(rand.nextInt(6));
		}
	}
}
