package start;

import java.util.Random;
import java.util.Scanner;

public class Ren2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください。");
		String name = sc.nextLine();
		System.out.println("あなたの年齢を入力してください。");
		String ageString = sc.nextLine();
		int age = Integer.parseInt(ageString);//変換
		int fortune = ran.nextInt(4);
		fortune++;
		sc.close();
		System.out.println("占いの結果がでました！");
		System.out.println(age + "歳の、" + name + "さん、あなたの運気番号は" + fortune + "です。");
		System.out.println("1: 大吉 2: 中吉 3: 吉 4: 凶");
	}
}
