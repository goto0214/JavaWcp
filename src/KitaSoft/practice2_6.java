package KitaSoft;

import java.util.Scanner;

public class practice2_6 {
	public static void main(String[] args) {
		System.out.println("あなたの年齢を入力してください。");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println("貴方が産まれてから約" + (x * 365) + "日です");
	}

}
