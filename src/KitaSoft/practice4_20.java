package KitaSoft;

import java.util.Scanner;

public class practice4_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 1; i <= count; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
