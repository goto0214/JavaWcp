
public class Ex {
	public static void main(String[] args) {
		int limit = 1000000;
		int i = 1234567890;
		int total = 0;
		for(int a = 1; a < limit; a++) {
			if(i % a == 0) {
				total += a;
				System.out.println(a);
			}
		}
		System.out.println(total);
	}
}
