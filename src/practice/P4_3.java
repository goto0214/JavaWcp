package practice;

import java.util.Scanner;

public class P4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("何乗まで計算しますか？？");
		int count = sc.nextInt();
		System.out.println("どの数字で計算しますか？");
		int num = sc.nextInt();
		
		int sum = 1;
		
		for(int i = 1; i <= count; i++) {
			sum *= num;
			System.out.println(num + "の" + i + "乗は" + sum);
		}
	}
}
