package object;

public class FireSword extends Sword{
	public FireSword() {
		this.name = "ファイアソード";
		this.attack = 10;
		this.element = "火炎";
		this.sword = true;
	}
	
	
	public void wear(SuperHero sh) {
		sh.attack += this.attack;
		
	}
	
	public void remove(SuperHero sh) {
		sh.attack -= this.attack;
	}
}
