package object;

public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public void bomb() {
		System.out.println("お化けキノコ" + this.suffix + "は自爆した！");
	}
}
