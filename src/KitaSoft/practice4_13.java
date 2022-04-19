package KitaSoft;

import java.util.Scanner;

public class practice4_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		while(x < 3 && y < 4) {
			System.out.println("ストライク=1 or ボール=2 ？");
			int i = sc.nextInt();
			if(i == 1) {
				x++;
			}else {
				y++;
			}
			
		}
		System.out.println( y + "ボール," + x + "ストライク" );
	}
}
