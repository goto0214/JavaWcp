package start;


public class Zu2_2 {
	public static void main(String[] args) {
		System.out.println("私の好きな記号は二重引用符(\")です。");
		
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);
		
		int age = (int)3.2;//よほどの事が無い限り、この強制型変換は使わない。
		System.out.println(age);
		
		d = 8.5 / 2;
		long l = 5 + 2L;
		System.out.println(d);
		System.out.println(l);
		
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);//用いた引数の大きい方を入れる。
		System.out.println(m);
		
		int r = new java.util.Random().nextInt(60);//60までの数字がランダムに入れられる。
		System.out.println(r);
	}
}
