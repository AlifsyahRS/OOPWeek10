package week10;

public class Frigate extends Vehicle implements SeaVessel {
	public void launch() {
		if(displacement == 0) {
			displacement++;
		} else {
			System.out.println("Vehicle already launched");
		}
	}
	
	public void fireGun() {
		System.out.println("Pew! Pew! Pew!");
	}
}
