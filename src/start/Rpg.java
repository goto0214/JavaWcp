package start;

import java.util.Random;
import java.util.Scanner;

public class Rpg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("貴方の名前を入力してください。");
		String name = sc.nextLine();
		System.out.println(name + "さんですね！よろしくお願いします！");
		int hp = rand.nextInt(50) + 200;
		int atk = rand.nextInt(30) + 200;
		int spd = rand.nextInt(5) + 30;
		int def = rand.nextInt(10) + 150;
		int m = 0; //経験値
		int pool = 5;
		System.out.println("あなたのステータスを表示します。");
		System.out.println("HP: " + hp);
		System.out.println("ATK: " + atk);;
		System.out.println("DEF: " + def);
		System.out.println("SPD: " + spd );
		System.out.println("次のレベルまで" + pool);
		sc.close();
		
		System.out.println("早速モンスターを倒してみましょう");
		
		int slime[] = new int[5];
		slime[0] = 60;//HP
		slime[1] = 170;//ATK
		slime[2] = 150;//DEF
		slime[3] = 25;//SPD
		slime[4] = 5;//経験値
		String se = "";
		System.out.println("スライムが現れた！");
		if(spd > slime[3]) {
			se = name;
		}else {
			se = "スライム";
		}
		System.out.println("先攻は" + se);
		System.out.println("早速攻撃してみましょう！");
		System.out.println("貴方の行動！１．攻撃　２．防御　３．逃げる");
	}
	
}
