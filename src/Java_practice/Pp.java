package Java_practice;

import java.util.Scanner;

public class Pp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("入力された数字を乗算します。数字を入力してください。");
		int num = sc.nextInt();
		System.out.println("何乗まで計算しますか？？");
		int count = sc.nextInt();
		sc.close();
		int sum = 1;
		
		for(int i = 0; i < count; i++) {
			sum *= num;
		}
		
		System.out.println(sum);
	}
}
