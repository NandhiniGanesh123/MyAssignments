package week1.day1;

public class Car {

	
	public void driveCar() {
		System.out.println("I am driving car");
	}
	public void applyBrake() {
		System.out.println("I will apply brake if any obstacle come");
	}
	public void soundHorn() {
		System.out.println("Horn to be apply when needed");
	}
	public void ispuncture() {
		System.out.println("Car got puncture if anything hits");
	}
	
	
	public static void main(String[] args) {
		
		Car vehicle=new Car();
		vehicle.driveCar();
		vehicle.applyBrake();
		vehicle.soundHorn();
		vehicle.ispuncture();
		
	}
}
