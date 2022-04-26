package KitaSoft;

import java.util.Scanner;

public class practice6_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println(MaxValue(x, y, z));
	}
	
	static int MaxValue(int n1, int n2, int n3) {
		int i = 0;
		if(n1 > n2) {
			i = n1;
		}else {
			i = n2;
		}
		
		if(i < n3) {
			i = n3;
		}
		return i;
	}
}
