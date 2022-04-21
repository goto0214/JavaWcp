package KitaSoft;

import java.util.Scanner;

public class practice5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int values[] = new int[10];
		for(int i = 0; i < 10; i++) {
			values[i] = sc.nextInt();
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.println(values[i]);
		}
	}
}
