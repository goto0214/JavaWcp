package KitaSoft;

import java.util.Scanner;

public class practice5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int values[] = new int[10];
		for(int i = 0; i < 10; i++) {
			values[i] = sc.nextInt();
		}
		System.out.print("\n偶数:");
		for(int n: values) {
			if((n % 2)  == 0) {
				System.out.print(n + " ");
			}
		}
		System.out.print("\n奇数: ");
		for(int n : values) {
			if((n % 2) != 0) {
				System.out.print(n + " ");
			}
		}
	}
}
