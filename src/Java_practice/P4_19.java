package Java_practice;

import java.util.Scanner;

public class P4_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
