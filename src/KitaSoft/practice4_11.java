package KitaSoft;

import java.util.Scanner;

public class practice4_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 0, out = 0; i < count; i++) {
			System.out.print(out++);
			if(out > 9) {
				out = 0;
			}
		}
	}
}
