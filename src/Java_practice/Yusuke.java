package Java_practice;

import java.util.Scanner;

public class Yusuke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "後藤　悠介";
		System.out.println("年齢を入力してください。");
		int age = sc.nextInt();sc.nextLine();
		System.out.println("職業を入力してください。");
		String job = sc.nextLine();
		sc.close();
		System.out.println("名前は" + name + "、年齢は" + age + "です。");
		System.out.println("職業は" + job);
	}
}
