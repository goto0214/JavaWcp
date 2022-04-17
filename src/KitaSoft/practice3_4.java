package KitaSoft;

import java.util.Scanner;

public class practice3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > y) {
			System.out.println("xはyより大きい");
		} else if(x < y) {
			System.out.println("xはyより小さい");
		} else {
			System.out.println("xとyは等しい");
		}
	}
}
