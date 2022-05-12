package Java_practice;

import java.util.Scanner;

public class P5_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int sum = 0;
		int count;
		for(count = 0; count < 10 && sum <= 100; count++) {
			num[count] = sc.nextInt();
			sum += num[count];
		}
		
		for(int i = 0; i < count; i++) {
			 System.out.print( "\n" + num[i] );
		}
	}
}
