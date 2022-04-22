
import java.util.Scanner;

public class practise_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("入力された数字を因数分解します");
		int num = sc.nextInt();
		for(int i = 2; num > 1; i++) {
			while((num % i) == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}
		
	}
}
