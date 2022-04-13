package solo;

public class Toribonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = 5;
		int count = 13;
		for(int i = 0; i < (count - 3); i++) {
			int d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
		System.out.println(c);
	}

}
