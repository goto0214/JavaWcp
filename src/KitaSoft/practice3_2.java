package KitaSoft;

import java.util.Scanner;

public class practice3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
}