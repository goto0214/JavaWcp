
import java.util.Scanner;

public class practice_e {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}
