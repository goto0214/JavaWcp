
public class Toribonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 5;
		int t = 13;
		for(int n = 0; n < (t - 3); n++) {
			int d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		System.out.println(c);
	}
}
//トリボナッチ数列
