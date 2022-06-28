package mod007;

public class FlyerTest {
	
	public static void main(String[] args) {
		Flyer f = new Airplane();
		Flyer b = new Bird();
		f.takeOff();
		b.takeOff();
		b.land();
	}
	
}


// Flyer f = getFlyer();
// 많은 class가 존재 할 때 수정에 용이하게 할 수 있음
// 수정에 있어서 빠르게 처리 가능 해야함