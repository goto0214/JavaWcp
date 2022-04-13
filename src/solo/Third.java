package solo;

public class Third {
	public static void main(String[] args) {
		int i = 1;
		int total = 0;
		String  s = "";
		while(i <= 20000) {
			s = String.valueOf(i);
			if(i % 3 == 0 || s.contains("3")) {
				System.out.println(i);
				total += i;
			}
			i++;
		}
		System.out.println(total);
	}
}
