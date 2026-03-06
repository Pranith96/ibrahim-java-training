
public class MainMethod {

	public static void main(String[] args) {
		PulserBike bike = new PulserBike();
		bike.engine();
		bike.tire();
		bike.breaks();
		bike.petrolTank();
		bike.color();

		FZBike bike1 = new FZBike();
		bike1.engine();
		bike1.tire();
		bike1.breaks();
		bike1.petrolTank();
		bike1.color();
		
		Bike bike2 = new FZBike(); // upcasting
		bike2.engine();
		bike2.tire();
		bike2.breaks();
		bike2.petrolTank();
		bike2.color();
	    Bike bike3 = new PulserBike(); // upcasting
	    bike3.engine();
	    bike3.tire();
	    bike3.breaks();
	    bike3.petrolTank();
	    bike3.color();
	}
}
