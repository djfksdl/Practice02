package com.javaex.practice;

public class Ex03 {
	//다음 코드는 오류가 있습니다. 오류의 내용을 찾고 올바르게 수정하여 코딩해 보세요
	public static void main(String[] args) {
		int age = 15;
		
		// age가 0살 초과이고 18살 미만이면
		if(age > 0 && age < 18) {
			System.out.println("청소년 입니다.");
		}
		// 0 < age < 18 은 자바에서 인식할 수 없으니 &&를 써서 조건을 2개로 분리시켜준다.
	}
}
