package mod007;

public class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("�� : ����");
	}

	@Override
	public void takeOff() {
		System.out.println("�� : �̷��ϱ�");
	}

	@Override
	public void land() {
		System.out.println("�� : �����ϱ�");
	}
}
