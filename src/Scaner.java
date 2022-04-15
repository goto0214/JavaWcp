import java.util.Scanner;
public class Scaner {
	 public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("数値を入力してください。");
	        int num = scanner.nextInt();	//・・・①
	        System.out.println("入力した数値は " + num + " です。");
	  }
}
