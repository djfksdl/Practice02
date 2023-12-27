package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	/*아래와 같이 작성된 코드가 있다.
	보기와 같은 형식으로 나이가 입력되었을 때 결과값을 예상하여 작성해 보세요*/
	
	public static void main(String[] args) {
		int age; // 나이
		Scanner sc = new Scanner(System.in);
		
		// 나이를 입력받는다.
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		// 그룹을 분류한다.
		if(age > 20) { // 20살 초과이면
			System.out.println("\"1번그룹\"");
		} else { //20살 이하이면
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();
		
		/*
		 * (1) 15일때 : 2번그룹
		 * (2) 19일때 : 2번그룹
		 * (3) 20일때 : 2번그룹
		 * (4) 21일때 : 1번그룹
		 * 5) 100일때 : 1번그룹
		 * */
	}
}
