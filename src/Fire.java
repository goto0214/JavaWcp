
import java.util.Scanner;

public class Fire {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("貴方の名前を入力してください。");
		String name = sc.nextLine();
		
		System.out.println(name + "さん、こんにちは！");
		
		System.out.println("貴方の友人のリストを作ります。何人入力しますか？？");
		System.out.println("数字を入力してください。");
		
		int num = sc.nextInt();sc.nextLine();
		String friend[] = new String[num];
		int age[] = new int[num];
		
		
		for(int i = 0; i < num; i++) {
			System.out.println("友人の名前を入力してください。");
			friend[i] = sc.nextLine(); 
			System.out.println("年齢は？？");
			age[i] = sc.nextInt();sc.nextLine();
		}
		sc.close();
		for(int i = 0; i < num; i++) {
			System.out.println(friend[i] + "さん " + age[i] + "歳");
		}
	}
}
