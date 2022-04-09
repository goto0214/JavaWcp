
public class FindSecound {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i < 20000; i++) {
			String str = String.valueOf(i);
			if(i % 2 == 0 || str.contains("2")) {
				total += i;
			}
		}
		System.out.println(total);
	}

}
