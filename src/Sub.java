
public class Sub {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 0;
		while(a <= 500) {
			if(a % 2 != 0) {
				b++;
				c += a;
			}
			a++;
		}
		System.out.println("1～500の間の奇数の数は" + b + "個です。");
		System.out.println("1～500の間の奇数を全て足した数は" + c + "です。");
	}
}
