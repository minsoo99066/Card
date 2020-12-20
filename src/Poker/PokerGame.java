/*
 * 1. d2_2 객체를 만들어서 기존 객체와 같은 카드인지 확인하는 프로그램 만들기
 * 
 * 2. Inheritance, extends, instanceOf, overriding, overloaded constructor, 
 *  polymolphism, equals vs ==, super, super(), this., this() 개념 정리하기
 * -> 코드들 살펴보기
 */
package Poker;

public class PokerGame {

	public static void main(String[] args) {
		Card d2 = new Red("D", 2);
		System.out.println(d2.toString());

		Card d2_2 = new Red("D", 2);
		System.out.println(d2_2.toString());

		Card d2_3 = null;
				
		// 모든 객체는 object의 자식들이기 때문에 오류 없다
		// card로 형변환이 불가능 하기 때문에 실행은 불가능
		
		// 가지고 있는 내용 비교
		if (d2.equals(d2_2)) {
			System.out.println("d2 and d2_2 are same.");
		} else {
			System.out.println("d2 and d2_2 are not same.");
		}

		// 가지고 있는 주소값 비
		if (d2 == d2_2) {
			System.out.println("d2 and d2_2 are same.");
		} else {
			System.out.println("d2 and d2_2 are not same.");
		}

		if (d2.equals(d2_3)) {
			System.out.println("d2 and d2_3 are same.");
		} else {
			System.out.println("d2 and d2_3 are not same.");
		}
	}
}
