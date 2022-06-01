package start;

import java.util.Scanner;

public class Ren4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください。");
		int input = sc.nextInt();
		sc.close();
		for(int number : numbers) {
			if(number == input) {
				System.out.println("アタリ！！！");
				break;
			}
		}
	}
}
