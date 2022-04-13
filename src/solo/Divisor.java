package solo;

public class Divisor {
	public static void main(String[] args) {
		int num = 1234567890;
		int total = 0;
		
		for(int i = 1; i <= 5000000; i++) {
			if(num % i == 0) {
				total += i;
			}
		}
		System.out.println("合計は" + total + "です");
	}
}
