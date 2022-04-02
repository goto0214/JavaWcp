package classMethod.human;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		
		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
			
		Human02 gotou = new Human02("後藤", 25);
		System.out.println("名前は" + gotou.name + "で、年齢は" + gotou.age + "です。");
	}
}
