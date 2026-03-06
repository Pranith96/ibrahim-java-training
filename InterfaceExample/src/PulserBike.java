
public class PulserBike implements Bike {

	@Override
	public void tire() {
		System.out.println("PulserBike tire");
	}

	@Override
	public void breaks() {
		System.out.println("PulserBike breaks");
	}

	@Override
	public void petrolTank() {
		System.out.println("PulserBike petrolTank");
	}

	@Override
	public void engine() {
		System.out.println("PulserBike engine");
	}

	@Override
	public void color() {
		System.out.println("PulserBike color");
	}
}
