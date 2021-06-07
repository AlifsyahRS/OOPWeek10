package week10;

public class PoliceCar extends Vehicle implements IsEmergency, LandVehicle {
	// Question 2b and 2c
	
	// New int attribute to represent the unit number of the police car
	int unitNumber;
	
	public PoliceCar(int unitNumber) {
		this.unitNumber = unitNumber;
	}
	
	public void drive() {
		displacement++;
	}
	
	public void soundSiren() {
		System.out.println("Wee woo wee woo wee woo!");
	}
	
	// Method for police cars to request for backup from other police cars
	public void requestBackup(String location) {
		System.out.println("This is unit number " + unitNumber + " requesting backup at " + location + ".");
	}
	
}
