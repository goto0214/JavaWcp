package Java_practice;

import java.util.Scanner;

public class num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = "素数。";
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				s = "素数ではない！";
			}
		}
		System.out.println(s);
	}
}
