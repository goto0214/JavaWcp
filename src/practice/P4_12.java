package practice;

import java.util.Scanner;

public class P4_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		for(num = 0; num <= 100;) {
			num += sc.nextInt();
		}
		System.out.println(num);
	}
}
