
public class FZBike implements Bike {

	@Override
	public void engine() {
		System.out.println("FzBike engine");
	}

	@Override
	public void tire() {
		System.out.println("FzBike tire");
	}

	@Override
	public void breaks() {
		System.out.println("FzBike breaks");
	}

	@Override
	public void petrolTank() {
		System.out.println("FzBike petrolTank");
	}

	public void color() {
		System.out.println("FzBike color");
	}

}
