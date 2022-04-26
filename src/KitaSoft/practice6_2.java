package KitaSoft;

import java.util.Scanner;

public class practice6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x + "と" + y + "の平均＝" + average(x, y));
	}
	static int average(int x, int y) {
		return (x + y) / 2;
	}
}
