package KitaSoft;

import java.util.Scanner;

public class practice5_4 {
	public static void main(String[] aegs) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int count, sum;
		for(count = 0, sum = 0; count < 10 && sum <= 100; count++) {
			num[count] = sc.nextInt();
			sum += num[count];
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println("\n" + num[i]);
		}
	}
}
