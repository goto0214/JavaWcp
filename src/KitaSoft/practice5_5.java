package KitaSoft;

import java.util.Scanner;

public class practice5_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int binary[] = new int[16];
		
		for(int i = 15; i >= 0; i--, num /= 2) {
			binary[i] = num % 2;
		}
		
		for(int i = 0; i < 16; i++) {
			System.out.print(binary[i]);
		}
	}
}
