package start;

public class Code5_4 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("後藤");
		hello("遠藤");
		hello("田平");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは！");
	}
}
