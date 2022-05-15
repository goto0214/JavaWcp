package Java_practice;

import java.util.Scanner;

public class P5_8 {
	public static void main(String[] args) {
		int num[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < 10; i++) {
			for(int j = i; j < 10; j++) {
				if(num[i] > num[j]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
