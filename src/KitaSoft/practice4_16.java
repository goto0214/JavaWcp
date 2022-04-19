package KitaSoft;

import java.util.Scanner;

public class practice4_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 2; n > 1 ; x++) {
			while((n % x) == 0) {
				System.out.print(x + " ");
				n /= x;
			}
		}
	}
}
