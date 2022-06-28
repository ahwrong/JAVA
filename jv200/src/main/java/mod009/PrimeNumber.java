package mod009;

public class PrimeNumber {
	public static void main(String[] args) {
		
		for (String argf : args ) {
			int sum = 0;
			try {
				sum += Integer.parseInt(argf);
				
				//소수 구하는 반복구문
				int count = 0;
				for(int i = 1; i <= sum; i++) {
					if(sum%i == 0) {
						count++;
					}
				}
				if(count == 2) {
					System.out.println(sum+"\n");
				}else { //소수가 아닐 시 인위적으로 에러 생성 숫자를 0으로 나누면 ArithmeticException 발생.
					System.out.println(sum/0);
				}
			}catch (ArithmeticException nfe) { //위에 인위적으로 낸 에러가 발생하면 catch 실행
				
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
