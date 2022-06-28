package com.varxyz.mj200.mod005;
// 중복 수 출력
public class TestArray {

	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5}; 
		int nums[] = {3,5,7};

		for (int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < i;) { 
				if (arr[i] == nums[j]) { 
					System.out.println("( 중복숫자 " + arr[i] + ")");
					
				}
			}
		}

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "  ");
		}

	}
}