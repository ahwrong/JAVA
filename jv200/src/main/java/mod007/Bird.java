package mod007;

public class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("»õ : ³¯±â");
	}

	@Override
	public void takeOff() {
		System.out.println("»õ : ÀÌ·úÇÏ±â");
	}

	@Override
	public void land() {
		System.out.println("»õ : Âø·úÇÏ±â");
	}
}
