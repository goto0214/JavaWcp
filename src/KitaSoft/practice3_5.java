package KitaSoft;

import java.util.Scanner;

public class practice3_5 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}
}
