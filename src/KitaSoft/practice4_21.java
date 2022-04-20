package KitaSoft;

import java.util.Scanner;

public class practice4_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size; j++) {
				
				if(i == j || (size - i - 1) == j)
					System.out.print("×");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
