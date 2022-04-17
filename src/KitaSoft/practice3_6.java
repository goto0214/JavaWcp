package KitaSoft;

import java.util.Scanner;

public class practice3_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x >= 0) {
			if(x == 0) {
				System.out.println("正の偶数");
			} else if(x % 2 == 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("正の奇数");
			}
		} else {
			if(x % 2 == 0) {
				System.out.println("負の偶数");
			} else {
				System.out.println("負の奇数");
			}
		}
	}
}
