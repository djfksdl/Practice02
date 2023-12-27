package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	//다음과 같이 정의되는 함수의 함수값을 계산해보자

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		double y1 = num*num*num - 9*num + 2;
		double y2 = 7*num + 2;
		
		if(num<=0) {
			System.out.println("계산결과는 " + y1 + "입니다.");
		} else {
			System.out.println("계산결과는 " + y2 + "입니다.");
		}
			
			
		sc.close();
	}
}
