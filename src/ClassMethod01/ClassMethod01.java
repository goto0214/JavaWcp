package ClassMethod01;

public class ClassMethod01 {
	public static void main(String[] args) {
		People yamada = new People();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		People sato = new People("佐藤", 25); 
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
		
	}
}
