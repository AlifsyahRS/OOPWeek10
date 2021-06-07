package week10;

public class Jeep extends Vehicle implements LandVehicle {
	
	public void drive() {
		this.displacement++;
	}
	
	public void soundHorn() {
		System.out.println("Honk!");
	}
}
