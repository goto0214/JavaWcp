package start;

import java.util.Scanner;

public class Ren3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int isHungry = sc.nextInt();
		String food = "納豆";
		sc.close();
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです。");
		}else {
			System.out.println(food + "をいただきます");
		}
	}
}
