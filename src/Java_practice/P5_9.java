package Java_practice;

import java.util.Scanner;

public class P5_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("入力された数字の100倍まで表示します。");
		int num = sc.nextInt();
		sc.close();
		for(int i = 1; i < 101; i++) {
			System.out.printf(" %2d", num * i);
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
}
