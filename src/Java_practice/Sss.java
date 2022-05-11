package Java_practice;

import java.util.Scanner;

public class Sss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 2; num > 1; i++) {
			while((num % i) == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}
	}
}
