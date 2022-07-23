package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// 문제.
		// 반 친구(최진혁, 최유빈, 한이람) 중에상담을 받은 사람을 나타내시오.
		String[] members = { "최진혁", "최유빈", "한이람" };
		for(int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
	}

}
