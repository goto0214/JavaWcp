package rpg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("貴方の名前は？");
		String yourName = sc.nextLine();
		int[] yourStatus = new int[5];
		String[] status = {"HP", "ATK", "DEF", "SPD", "LUK"};
		System.out.println("貴方のステータスを決めます。リセマラできます。");
		for(int a = 0; a < 1;) {
			Status.status(yourStatus);
			for(int i = 0; i < 5; i++) {
				System.out.println(status[i] + ": " + yourStatus[i]);
			}
			System.out.println("このステータスでいいでしょうか？？");
			System.out.println("OKなら数字の1を入力してください。NGならそれ以外の数字を入力してください。");
			int i = sc.nextInt();
			if(i == 1) {
				a++;
			}
		}
		
	}
}
