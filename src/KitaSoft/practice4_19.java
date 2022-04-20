package KitaSoft;

import java.util.Scanner;

public class practice4_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int count = 0;
		for( ; ;) {
			int sum = sc.nextInt();
			if(sum == 0) 
				break;
			
			
			i += sum;
			count++;
		}
		System.out.println(i / count);
	}
}
