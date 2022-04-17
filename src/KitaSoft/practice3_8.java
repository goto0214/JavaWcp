package KitaSoft;

import java.util.Scanner;

public class practice3_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x >= 60 && y >= 60) {
			System.out.println("合格");
		}else if(x + y >= 130) {
			System.out.println("合格");
		}else if(x + y >= 100 && (x >= 90 || y >= 90)) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
			
		
	}
}
