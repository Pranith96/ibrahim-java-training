
public class MainMethod {

	public static void main(String[] args) {
		PulserV1 bike = new PulserV1();	
		bike.engine();
		bike.tire();
		bike.breaks();
		bike.petrolTank();
		bike.color();
		
		FzBike bike1 = new FzBike();
		bike1.engine();
		bike1.tire();
		bike1.breaks();
		bike1.petrolTank();
		bike1.color();
	}
}
