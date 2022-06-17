package object;

public class Matango {
	String name;
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	public Matango() {
		this.name = "マタンゴ";
		this.hp = 10;
	}
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public void bomb() {
		System.out.println("お化けキノコ" + this.suffix + "は自爆した！");
	}
}
