
public class Aaa {
	public static void main(String[] args) {
		String[] names = {"悠介", "憲司", "晴紀"};
		for(int i =0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}
