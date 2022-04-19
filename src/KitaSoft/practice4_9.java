package KitaSoft;

import java.util.Scanner;

public class practice4_9 {
	public static void main(String[] aegs) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		for(int i = 0; i <= 10; i++) {
			int n = sc.nextInt();
			if (max == 0 && min == 0) {
				max = n;
				min = n;
			}
			if(max < n) {
				max = n;
			} else if(min > n){
				min = n;
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
}
