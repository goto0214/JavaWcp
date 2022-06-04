package start;

import java.util.Scanner;

public class Ren5_2 {
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String address = sc.nextLine();
		String title = sc.nextLine();
		String text = sc.nextLine();
		
		email(title, address, text);
	}
}
