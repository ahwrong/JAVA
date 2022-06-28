package mod009;

public class PrimeNumber2 {
	// �Ҽ��Ǻ� �Լ�
	// 1~N���� �ݺ��Ͽ� �����鼭 ����������� count�� ������Ų��.
	public boolean isPrime(int N){
		// ���� �������� "1���� ū �ڿ���"�̹Ƿ� 1�� �Ҽ��� �ƴϴ�.
		if( N == 1 ) return false;

		int count = 0;
		for(int i = 1; i <= N; i++){
			if( N % i == 0 ){
				count += 1;
			}
		}
		return count == 2;
	}
}

//public class PrimeNumber2 {
//	public boolean isPrime2(int N){
//		// 1�� �Ҽ��� �ƴϴ�.
//		if( N == 1 ) return false;
//	   	// 2�� �Ҽ���.
//		if( N == 2 ) return true;
//		// 2���� ū ¦���� �Ҽ��� �ƴϴ�.
//		if( N % 2 == 0 ) return false;
//	
//		int count = 0;
//		for(int i = 1; i <= N; i++){
//			if( N % 2 == 0 )
//				count += 1;
//		}
//		return count == 2;
//}
// ������
//public boolean isPrime3(int N){
//	// 1�� �Ҽ��� �ƴϴ�.
//	if( N == 1 ) return false;
//   	// 2�� �Ҽ���.
//	if( N == 2 ) return true;
//	// 2���� ū ¦���� �Ҽ��� �ƴϴ�.
//	if( N % 2 == 0 ) return false;
//    
//   	int count = 0;
//	for(int i = 2; i <= Math.sqrt(N); i++){
//		if( N % i == 0 ){
//			count++;
//		}
//	}
//	return count == 0;
//}