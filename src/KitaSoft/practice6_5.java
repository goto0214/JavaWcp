package KitaSoft;

import java.util.Scanner;

public class practice6_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("何回出力しますか？");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println("数字を入力して下さい。");
			int a = sc.nextInt();
			System.out.println("出力する記号を入力してください。（一文字）");
			char s = sc.next().charAt(0);
			DrawTriangle2(a, s);
		}
	}
	
	static void DrawTriangle2(int size, char ch) {
		for(int n = 0; n < size; n++) {
			for(int j = 0; j <= n; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
