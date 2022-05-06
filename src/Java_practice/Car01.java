package Java_practice;

public class Car01 {
	private double fuelCost;
	private double fuelAmount;
	
	public Car01(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int m) {
		System.out.println(m + "km走ります。");
		this.fuelAmount -= (m / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
