
public class Aaaa {
	public static void main(String[] args) {
		int[] i = {2, 6, 10, 3, 17, 18, 4, 48, 39, 199, 76};
		int b = 0;
		int c = 0;
		for(int a = 0; a < i.length; a++) {
			if(b <= i[a]) {
				b = i[a];
			}			
		}
		for(int a = 0; a < i.length; a++) {
			if(i[a] == b) {
				continue;
			}else if(c <= i[a]) {
				c = i[a];
			}
		}
		
		System.out.println("配列の中で一番大きい数は" + b + "です");
		System.out.println("配列の中で二番目に大きい数は" + c + "です");
	}
}
