package Java_practice;

import java.util.Scanner;

public class P5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < 10; i++) {
			System.out.println(num[i] * 2);
		}
	}
}
