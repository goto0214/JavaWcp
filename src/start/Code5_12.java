package start;

//引数に配列を受け取るメソッドの利用

public class Code5_12 {
	public static void printArray(int[] array) {
		for(int element : array) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);
	}
}
