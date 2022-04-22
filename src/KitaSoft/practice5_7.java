package KitaSoft;

import java.util.Scanner;

public class practice5_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kuku[][] = new int[9][9];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		int p = sc.nextInt();
		int q = sc.nextInt();
		System.out.println(kuku[p-1][q-1]);
	}
}
