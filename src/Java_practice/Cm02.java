package Java_practice;

public class Cm02 {
	public static void main(String[] args) {
		People02 tabira = new People02();
		System.out.println("名前は" + tabira.name + "で、年齢は" + tabira.age + "です。");
		
		People02 endo = new People02("遠藤", 25);
		System.out.println("名前は" + endo.name + "で、年齢は" + endo.age + "です。");
	}
}
