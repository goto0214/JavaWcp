package KitaSoft;

import java.util.Scanner;

public class practice4_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int titan = 0;
		int tiger = 0;
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、巨人の得点は？");
			titan += sc.nextInt();
			System.out.print(i + "回表、阪神の得点は？");
			tiger += sc.nextInt();
		}
		System.out.println("巨人 ：" + titan + "点, 阪神" + tiger + "点");
		if(titan > tiger) {
			System.out.println("巨人の勝ち");
		}else if(titan < tiger) {
			System.out.println("阪神の勝ち");
		}else {
			System.out.println("引き分け");
		}
	}
}
