package KitaSoft;

import java.util.Scanner;

public class practice4_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for( ; ;) {
			int sum = sc.nextInt();
			if(sum == 0) 
				break;
			
			
			i += sum;
		}
		System.out.println(i);
	}
}
