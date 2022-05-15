package Java_practice;

import java.util.Scanner;

public class P5_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kuku[][] = new int[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(kuku[a - 1][b - 1]);
		
	}
}
