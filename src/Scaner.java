import java.util.Scanner;


public class Scaner {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        int num2 = sc1.nextInt();
        
        int total = num2;
        for(int i = 1; i < num1; i++ ){
            int a = sc1.nextInt();
            total += num2 - a;
        }
        System.out.println(total * num2);
    }
}