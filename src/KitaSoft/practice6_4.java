package KitaSoft;

import java.util.Scanner;

public class practice6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("何回入力しますか？");
		int count = sc.nextInt();
		for(int i = 0; i < count; i++) {
			System.out.println("数字を入力して下さい。");
			int x = sc.nextInt();
			DrawTriangle(x);
			System.out.println();
		}
	}
	
	static void DrawTriangle(int size) {
		for(int a = 0; a < size; a++) {
			for(int b = 0; b <= a; b++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
