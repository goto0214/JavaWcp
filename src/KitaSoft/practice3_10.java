package KitaSoft;

import java.util.Scanner;

public class practice3_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x < y && (x + y) % 2 == 0) {
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
		}
		
		if(x == y && x < 0) {
			System.out.println("\"xとyは等しく、かつ、負の数である。");
		}
		
		if(x < y || x % 2 == 0) {
			System.out.println("xはyより小さい、または、xは偶数である。");
		}
		
		if((x <= 10 || x >= 100) && (10 >= y || y <= 100)) {
			System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
		}
		
		if(x < 0 && y < 0) {
			System.out.println( "xもyも負の数である。" );
		}else if(x > 0 || y > 0) {
			System.out.println( "xもyも負の数ではない。" );
		}
	}
}
