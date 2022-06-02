package start;

public class Code5_7 {
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 =" + ans);
		System.out.println(add(add(10, 20), add(30, 40)));//戻り値をそのまま使う。
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
}
