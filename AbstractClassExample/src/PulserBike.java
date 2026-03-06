
public abstract class PulserBike extends Bike {

	@Override
	public void petrolTank() {
		System.out.println("PulserBike petrolTank");
	}

	@Override
	public void tire() {
		System.out.println("PulserBike tire");
	}
	
	public abstract void color();
}
