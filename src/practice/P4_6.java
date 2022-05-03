package practice;

import java.util.Scanner;

public class P4_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int num;
		for(int i = 0; i < 10; i++) {
			num = sc.nextInt();
			if(num == 0) {
				lose += 1;
			}else {
				win += 1;
			}
		}
		System.out.println("勝ち" + win);
		System.out.println("負け" + lose);
	}
}
