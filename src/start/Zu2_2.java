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
	}
}
