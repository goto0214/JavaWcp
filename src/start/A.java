package start;
/*
 * 覚えるもの
 */
public class A {
	public static void main(String[] args) {
		String a = "10";
		final int A = Integer.parseInt(a);//変換
		
		if(a.equals("10")) {//文字列の比較
			System.out.println(A);
		}
		
		switch(a) {
		case "10":
		    System.out.println(A);
		    break;
		case "20":
			break;
		}
		
	}
}
