package Java_practice;

public class Cap01 {
	public static void main(String[] args) {
		NoCapsule human1 = new NoCapsule("田中", 28);
		human1.name = "今田";
		human1.age = 70;
		System.out.println("名前は" + human1.name + ", 年齢は" + human1.age + "です。");
		
		Capsule human2 = new Capsule("小林", 32);
		System.out.println("名前は" + human2.getName() + ", 年齢は" + human2.getAge() + "です。");
		human2.setName("笹井");
		System.out.println("変更した名前は" + human2.getName() + "です。");
	}
	
	
	
}
