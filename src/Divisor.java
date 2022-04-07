
public class Divisor {
	public static void main(String[] args) {
		int num = 1234567890;
		int a = 0;
		for(int i = 1; i <= 5000000; i++) {
			if(num % i == 0) {
				a += i;
			}
		}
		System.out.println(a);
	}
}
