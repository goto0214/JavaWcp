package object;

public final class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero("ミナト");
		System.out.println(h.name);
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		
		Wizard w = new Wizard();
		w.name = "菅原";
		w.hp = 50;
		
		w.heal(h);
		w.heal(h);
		
		Matango m1 = new Matango();
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.suffix = 'B';
		
		SuperHero sh = new SuperHero(h.name);
		System.out.println(sh.name);
		System.out.println(sh.hp);
		h.run();
		sh.run();
		sh.attack(m2);
		System.out.println(m2.hp);
	}
}
