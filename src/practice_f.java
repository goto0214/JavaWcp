
import java.util.Scanner;

public class practice_f {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("\n" + "偶数：");
		for(int i = 0; i < 10; i++) {
			if((num[i] % 2) == 0) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.print("\n" + "奇数：");
		for(int i = 0; i < 10; i++) {
			if((num[i] % 2) != 0) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
