package object;

public class Matango {
	String name;
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	public Matango(char suffix) {
		this.name = "マタンゴ";
		this.hp = 10;
		this.suffix = suffix;
	}
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public void attack(Hero h) {
		System.out.println("お化けキノコ" + this.suffix + "の攻撃");
		System.out.println(h.name + "は10のダメージを受けた");
		h.hp -= 10;
	}
}
