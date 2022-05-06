package Java_practice;

import java.util.Scanner;

public class Cm03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("あなたの名前は？");
		String name = sc.nextLine();
		System.out.println("年齢は？");
		int age = sc.nextInt();sc.nextLine();;
		System.out.println("職業は？");
		String profession = sc.nextLine();
		
		
		People03 your = new People03(name, age, profession);
		System.out.println(your.name + "さんこんにちは！");
		String profile = your.getPro();
		System.out.println(profile);
		
		System.out.println("あなたの一番仲の良い友人の名前は何ですか？？");
		String friend = sc.nextLine();
		your.greet(friend);
		sc.close();
	}
}
