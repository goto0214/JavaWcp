package classMethod.human;

public class ClassMethodA {
	public static void main(String[] args) {
		HumanA gotou = new HumanA();
		System.out.println("名前は" + gotou.name + "で、年齢は" + gotou.age + "です。");
		System.out.println("趣味は" + gotou.hobby + "です。");
		
		HumanA tabira = new HumanA("田平", 25, "APEX");
		System.out.println("名前は" + tabira.name + "で、年齢は" + tabira.age + "です。");
		System.out.println("趣味は" + tabira.hobby + "です。");
	}
}
