package Java_practice;

public class People04 {
	static public int peopleCount = 0;
	public String name;
	
	public static final String GREETING = "こんにちは";
	
	public People04(String name) {
		this.name = name;
		People04.peopleCount++;
	}
	
	static public void count() {
		System.out.println("人の数は" + People04.peopleCount);
	}
	
	public void name() {
		System.out.println("名前は" + name);
	}
}
