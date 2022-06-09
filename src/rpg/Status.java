package rpg;

import java.util.Random;

public class Status {
	public static void yourStatus(int[] status) {
		Random ran = new Random();
		status[0] = ran.nextInt(100) + 200;//HP
		status[1] = ran.nextInt(10) + 10;//Attak
		status[2] = ran.nextInt(5) + 5; //DEF
		status[3] = ran.nextInt(5) + 3; //SPD
		status[4] = ran.nextInt(3) + 1;//LUK
	}
	
	
	public static void fellowStatus(int[] status) {
		Random ran = new Random();
		status[0] = ran.nextInt(100) + 200;//HP
		status[1] = ran.nextInt(10) + 10;//Attak
		status[2] = ran.nextInt(5) + 5; //DEF
		status[3] = ran.nextInt(5) + 3; //SPD
		status[4] = ran.nextInt(3) + 1;//LUK
	}
}
