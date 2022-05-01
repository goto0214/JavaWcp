package practice;

import java.util.Scanner;

public class P5_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		System.out.println("10個の数字を入力してください。偶数と奇数に分けます。");
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("奇数：");
		for(int i = 0; i < 10; i++) {
			
			if((num[i] % 2) != 0) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		System.out.print("偶数：");
		for(int i = 0; i < 10; i++) {
			if((num[i] % 2) == 0) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
