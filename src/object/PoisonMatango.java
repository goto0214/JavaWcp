package object;

public class PoisonMatango extends Matango{
	int poisonCount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
		this.name = "毒されたお化けキノコ";
	}
	
	
	public void attack(Hero h) {
		super.attack(h);
		if(this.poisonCount != 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int point = h.hp / 5;
			h.hp -= point;
			System.out.println(point + "ポイントのダメージ");
			poisonCount --;
		}
	}
}
