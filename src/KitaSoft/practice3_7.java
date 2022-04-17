package KitaSoft;

import java.util.Scanner;

public class practice3_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		
		if(point >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		if(point >= 80) {
			System.out.println("たいへんよくできました");
		} else if(point >= 60 && point < 80) {
			System.out.println("よくできました");
		}else {
			System.out.println("ざんねんでした");
		}
		
		if(point >= 80) {
			System.out.println("優");
		} else if(point >= 70 && point < 80) {
			System.out.println("良");
		} else if(point >= 60 && point < 70) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}
}
