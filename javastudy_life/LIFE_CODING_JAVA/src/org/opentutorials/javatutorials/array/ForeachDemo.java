package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람"};
		for(String e : members) {
			System.out.println(e + "이 상담을 받았습니다.//");
		}

	}

}

// 배열의 오류

// 지정한 배열의 수 보다 elements가 더 많을 때 발생한다. 
// String[] members = { "최진혁", "최유빈", "한이람" };
// System.out.println(members[3]);   
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
// at ot_array.ExceptionDemo.main(ExceptionDemo.java:7)

// 배열의 한계
// 배열은 초기화 할 때 그 크기가 정해진다. 그래서 정해진 크기 이상의 값을 넣을 수 없다.
// 자바에는 컬렉션(Collection) 이라는 기능이 있다. Container라고도 부르는 이 기능을 이용하면
// javaScript의 배열과 같이 유연하게 배열을 사용할 수 있다.
// 컬렉션은 매우 중요한 주제이지만 객체지향에서 이해가 있을 때 공부해보도록 하겠다.