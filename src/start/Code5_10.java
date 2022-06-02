package start;

//オーバーロード（引数の型が異なる場合）

public class Code5_10 {
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static String add(String x, String y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		
		System.out.println(add(5.3, 4.9));
		
		System.out.println(add("Hello", "World"));
	}
}
