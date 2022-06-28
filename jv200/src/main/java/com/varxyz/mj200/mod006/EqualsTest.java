package com.varxyz.mj200.mod006;

/**
 * 이 회사의 사원은 이름과 생일이 같다면 같은 사원으로 인식되도록
 * equals() 메소드를 재정의하세요.
 * @author Administrator
 * 1. 이름은 string 값, 두개의 string을 비교. 
 * 2. MyData 2개, 2개가 같은지 다른지 비교. (equals)
 * 3. 2가지 문제가 동시에 처리 되어야 함.
 * 4. Employee (equals)
 */

public class EqualsTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("유비");
		e.setSalary(1000.0);
		e.setBirthDate(new MyDate(10, 4, 2000));

		Employee e2 = new Employee();
		e2.setName("유비");
		e2.setSalary(1000.0);
		e2.setBirthDate(new MyDate(10, 4, 2000));

		System.out.println(e==e2);			//false
		System.out.println(e.equals(e2)); //false
	}
}
