package object;

public final class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		Hero h = new Hero("ミナト");
		System.out.println(h.name);
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		
		Wizard w = new Wizard();
		w.name = "菅原";
		w.hp = 50;
		
		w.heal(h);
		w.heal(h);
		
		
		
		SuperHero sh = new SuperHero(h.name);
		System.out.println(sh.name);
		System.out.println(sh.attack);
		
		FireSword f = new FireSword();
		f.wear(sh);
		System.out.println(sh.attack);
		f.remove(sh);
		System.out.println(sh.attack);
		
		
		PoisonMatango pm = new PoisonMatango('A');
		System.out.println(sh.hp);
		pm.attack(sh);
		System.out.println(sh.hp);
	}
}
