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
			Status.yourStatus(yourStatus);
			for(int i = 0; i < 5; i++) {
				System.out.println(status[i] + ": " + yourStatus[i]);
			}
			System.out.println("このステータスでいいでしょうか？？");
			System.out.println("OKなら数字の1を入力してください。NGならそれ以外の数字を入力してください。");
			int i = sc.nextInt();sc.nextLine();
			if(i == 1) {
				a++;
			}
		}
		
		System.out.println("ステータスを決定しました。");
		
		
		System.out.println("次は仲間の名前とステータスを決定します。名前を入力してください。");
		String fellowName = sc.nextLine();
		System.out.println(fellowName + "ですね。次はステータスです。");
		int[] fellowStatus = new int[5];
		for(; ; ) {
			Status.fellowStatus(fellowStatus);
			for(int i = 0; i < 5; i++) {
				System.out.println(status[i] + ": " + fellowStatus[i]);
			}
			System.out.println("このステータスでいいでしょうか？？");
			System.out.println("OKなら数字の1を入力してください。NGならそれ以外の数字を入力してください。");
			int i = sc.nextInt();sc.nextLine();
			if(i == 1) {
				break;
			}
		}
	}
}
