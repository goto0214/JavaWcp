
public class Test {
	public static void main(String[] args) {
		int i = 1;
		int c = 0;
		int x = 0;
		while(i <= 50) {
			if(i % 2 == 0) {
				System.out.println(i);
				c++;
				x += i;
			}
			i++;
		}
		System.out.println("１～１０までの偶数の総和は" + x + "です");
		System.out.println("偶数の数は" + c + "です。");
	}
}
