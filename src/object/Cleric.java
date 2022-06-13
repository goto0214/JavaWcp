package object;

import java.util.Random;

public class Cleric {
	String name;
	int hp;
	int mp;
	final int MAX_HP = 50;
	final int MAX_MP = 10;
	Random rd = new Random();
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒祈った");
		int recover = rd.nextInt(3) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
