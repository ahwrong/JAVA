package mod007;

public class Airplane implements Flyer, Vehicle{

	@Override
	public void fly() {
		System.out.println("����� : ����");
	}

	@Override
	public void takeOff() {
		System.out.println("����� : �̷��ϱ�");
	}

	@Override
	public void land() {
		System.out.println("����� : �����ϱ�");
	}

}
