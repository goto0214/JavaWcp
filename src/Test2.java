
public class Test2 {
	public static void main(String[] args) {
		String s = "";
		for (int i = 1; i <= 10; i++) {
			if(i == 10) {
				s = s + String.valueOf(i);
				break;
			}
			s +=String.valueOf(i) + ",";
		}
		System.out.println(s);
		
	}
}
