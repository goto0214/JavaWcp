package solo;

public class Reciprocal {
	public static void main(String[] args) {
		double sum = 0;
		int i = 1;
		int count = 0;
		while(sum < 15) {
			sum += 1.0/i;
			i++;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
