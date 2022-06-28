package mod009;

public class PrimeNumber2 {
	// 소수판별 함수
	// 1~N까지 반복하여 나누면서 나누어떨어지면 count를 증가시킨다.
	public boolean isPrime(int N){
		// 위의 명제에서 "1보다 큰 자연수"이므로 1은 소수가 아니다.
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
//		// 1은 소수가 아니다.
//		if( N == 1 ) return false;
//	   	// 2는 소수다.
//		if( N == 2 ) return true;
//		// 2보다 큰 짝수는 소수가 아니다.
//		if( N % 2 == 0 ) return false;
//	
//		int count = 0;
//		for(int i = 1; i <= N; i++){
//			if( N % 2 == 0 )
//				count += 1;
//		}
//		return count == 2;
//}
// 제곱근
//public boolean isPrime3(int N){
//	// 1은 소수가 아니다.
//	if( N == 1 ) return false;
//   	// 2는 소수다.
//	if( N == 2 ) return true;
//	// 2보다 큰 짝수는 소수가 아니다.
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