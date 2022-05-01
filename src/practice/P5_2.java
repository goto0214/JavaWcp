package practice;

import java.util.Scanner;

public class P5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		System.out.println("10個の数字を入力してください。");
		for(int i = 0; i < 10; i++) {
			
			num[i] = sc.nextInt();
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.printf(" %2d", num[i]);
		}
	}
}
