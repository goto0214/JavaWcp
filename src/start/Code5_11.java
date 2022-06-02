package start;

//オーバーロード（引数の数が異なる場合）

public class Code5_11 {
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		int ans1 = add(30, 40);
		int ans2 = add(20, 30, 40);
		
		System.out.println(ans1 + "   " + ans2);
	}
}
