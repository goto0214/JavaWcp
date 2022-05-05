package practice;

import java.util.Scanner;

public class P4_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num = 0;
		for(int i = 0; i < count; i++) {
			System.out.print(num);
			num++;
			if(num > 9) {
				num = 0;
			}
		}
	}
}
