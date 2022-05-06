package Java_practice;

public class Ch09 {
	public static void main(String[] args) {
		double fuelCost = 12.5;
		double fuelAmount = 55.0;

        Car01 car = new Car01(fuelCost, fuelAmount);
        
        car.move(20);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
        car.move(50);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
	}
}
