package start;

import java.util.Random;
import java.util.Scanner;

public class Ren3_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("【数当てゲーム】");
		int ans = ran.nextInt(10);
		for(int i = 0; i < 5; i++) {
			System.out.println("0～9の数字を入力してください。");
			int num = sc.nextInt();
			if(num == ans) {
				System.out.println("アタリ");
				break;
			}
			System.out.println("違います");
		}
		sc.close();
		System.out.println("正解は" + ans);
		System.out.println("ゲームを終了します");
	}
}
