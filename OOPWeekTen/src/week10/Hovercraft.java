package week10;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
	// I added isInLand to give functionality to enterLand() and enterSea()
	private boolean isInLand = true;
	
	public void launch() {
		if(displacement == 0) {
			displacement++;
		} else {
			System.out.println("Vehicle already launched");
		}
	}
	
	public void drive() {
		displacement++;
	}
	
	public void enterLand() {
		isInLand = true;
	}
	
	public void enterSea() {
		isInLand = false;
	}
}
