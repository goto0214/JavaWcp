
public class findThird {
	public static void main(String[] args) {
		int num = 1;
		int num1 = 0;
		String str = "";
		System.out.println("1～20000の間の３の倍数、３のつく数字を出力します");
		while (num <= 20000) {
			str = String.valueOf(num);
			if (num % 3 == 0 || str.contains("3")) {
				System.out.println(num);
				num1 += num;
			}
			num++;
		}
		System.out.println(num1);
	}
}
