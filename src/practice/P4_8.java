package practice;

import java.util.Scanner;

public class P4_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for(int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			if(i == 0) {
				num = n;
			}
			if(num < n) {
				num = n;
			}
		}
		System.out.println(num);
	}
}
