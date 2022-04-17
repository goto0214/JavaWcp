package KitaSoft;

import java.util.Scanner;

public class practice3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int x = sc.nextInt();
		
		System.out.println(">0=午前、1=午後、2=夜間");
		int y = sc.nextInt();
		
		if(x == 0) {
			System.out.println("休診");
		}else if((x == 2 || x == 5) && y == 0) {
			System.out.println("休診");
		}else if (x == 3 && y == 2) {
			System.out.println("休診");
		}else if(x == 6 && (y == 1 || y == 2)) {
			System.out.println("休診");
		}else {
			System.out.println("〇");
		}
	}
}
