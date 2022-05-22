package Study;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		//System.out.println("Enter the number");

		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();

		if (b % 2 == 0) {
			System.out.println("number is a even" + b);
		} else {
			System.out.println("number is a odd" + b);
		}

	}

}
