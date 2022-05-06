package Java_practice;

public class People03 {
	public String name;
	public int age;
	public String profession;
	
	public People03() {
		this.name = "田平";
		this.age = 25;
		this.profession = "職人";
	}
	
	public String getPro() {
		return "年齢は" + this.age + "、職業は" + this.profession + "なんですね！素晴らしいですね！！";
	}
	
	public People03(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}
	
	public void greet(String friend) {
		if(friend == null) {
			System.out.println("挨拶する友達が分かりません…");
			return;
		}
		System.out.println(friend + "さんが親友なんですね！");
	}
}
