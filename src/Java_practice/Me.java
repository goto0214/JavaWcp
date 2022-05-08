package Java_practice;

public class Me {
	public static void main(String[] args) {
		Friend tabira = new Friend("田平", 25, "運送屋");
		System.out.println("私の友人は名前は" + tabira.getName() + "年は" + tabira.getAge() + "歳です。");
		System.out.println("職業は" + tabira.getJob() + "です。");
		tabira.setJob("職人");
		System.out.println(tabira.getName() + "は、" + tabira.getJob() + "に転職しました。");
	}
}
