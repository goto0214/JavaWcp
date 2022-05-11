package Java_practice;

import java.util.Scanner;

public class P4_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		for(; ;) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			count++;
			sum += num;
		}
		sc.close();
		System.out.println(sum / count);
		
	}
}
