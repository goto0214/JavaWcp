package KitaSoft;

import java.util.Scanner;

public class practice4_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int n;
		int count = 0;
		for(n = 2; n < value; n++) {
			if(value % n == 0) {
				System.out.println("素数ではないです");
				count++;
				break;
			}
			
		}
		if(count == 0) {
			System.out.println("素数です");
		}
	}
}
