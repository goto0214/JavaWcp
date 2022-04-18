package paiza;

import java.util.Scanner;

public class practice1_1 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int m = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= m; i++){
            int room = sc.nextInt();
            String rooms = String.valueOf(room);
            if(rooms.contains(n)){
                }else{
                    System.out.println(rooms);
                    count++;
            }
                
            }
            if(count == 0){
                System.out.println("none");
            }
            
        }
    }


