package KitaSoft;

public class practice6_6 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			KukuColumn(i);
		}
	}
	
	static void KukuColumn(int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf(" %2d", num * i);
		}
		System.out.println();
	}
}
