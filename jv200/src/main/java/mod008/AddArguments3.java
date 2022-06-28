package mod008;

public class AddArguments3 {
	public static void main(String[] args) {
		int sum = 0;
		for ( String arg : args ) {
			try {
				sum += Integer.parseInt(arg);
			} catch (NumberFormatException nfe) {
				System.err.println("[" + arg + "] is not an integer" 
						+ " and will not be included in the sum.");
			}
		}
		System.out.println("Sum = " + sum);
	}
}

// 비정상적 종료 
// try-catch 에 따른 상황
// 오류 + 결과값 
