package Java_practice;

import java.util.Scanner;

public class Status {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();sc.nextLine();
		String name[] = new String[count];
		int age[] = new int[count];
		String job[] = new String[count];
		
		for(int i = 0; i < count; i++) {
			name[i] = sc.nextLine();
			age[i] = sc.nextInt();sc.nextLine();
			job[i] = sc.nextLine();
		}
		sc.close();
		for(int i = 0; i < count; i++) {
			System.out.print(name[i] + "  " + age[i] + "歳  仕事は" + job[i]);
			System.out.println();
		}
		
	}
}
