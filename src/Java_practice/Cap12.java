package Java_practice;

public class Cap12 {
	public static void main(String[] args) {
		Man man = new Man("後藤", 25);
		System.out.println("名前は" + man.getName() + "です");
		System.out.println("年齢は" + man.getAge() + "です。");
		man.setAge(26);
		System.out.println("誕生日を迎えたので、年齢が" + man.getAge() + "になりました。");
	}
}
