package KitaSoft;

import java.util.Scanner;

public class practice5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int values[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			values[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int n: values) {
			System.out.println(n * 2);
		}
	}
}
