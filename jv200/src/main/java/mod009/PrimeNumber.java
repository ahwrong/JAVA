package mod009;

public class PrimeNumber {
	public static void main(String[] args) {
		
		for (String argf : args ) {
			int sum = 0;
			try {
				sum += Integer.parseInt(argf);
				
				//�Ҽ� ���ϴ� �ݺ�����
				int count = 0;
				for(int i = 1; i <= sum; i++) {
					if(sum%i == 0) {
						count++;
					}
				}
				if(count == 2) {
					System.out.println(sum+"\n");
				}else { //�Ҽ��� �ƴ� �� ���������� ���� ���� ���ڸ� 0���� ������ ArithmeticException �߻�.
					System.out.println(sum/0);
				}
			}catch (ArithmeticException nfe) { //���� ���������� �� ������ �߻��ϸ� catch ����
				
				for ( int j = 0; j <= sum; j++ ) {
					for ( int k = 2; k <= j; k++ ) {
						if( j*k == sum ) {
							System.err.println("[" + argf + ") = " +j+ "X" +k+ "\n");
						}
					}
				}
			}
		}
	}
}
