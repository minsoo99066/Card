/*
 * 상속 연습문제_포커 게임 (112320)
 * 카드의 모양은 4가지(S, H, C, D) 숫자는 1부터 13까지 -> 총 52
 * 카드라는 부모 클래스를 만들어서 두개의 변수를 넣어라 (하나는 문자열 하나는 숫자)
 * 생성자를 총 4가지를 만들건데 1. 인수 없는 것 2. 모양만 넣는 것 3. 숫자만 넣는 것 4. 숫자모양 둘 다 넣는 것
 * setShape getShape setNumber getNumber의 함수 만들기
 * toString 함수 override 하기 -> shape 와 number 출력
 * showMyColor (abstracting method) 
 * 
 * card class 를 상속받는 red , black class 를 만들어라
 * 
 */

package Poker;

public abstract class Card {
	private String shape;
	private int number;

	// default constructor
	public Card() {
		shape = "";
		number = 0;
	}

	// overloaded constructor
	public Card(String newShape) {
		number = 0;
		setShape(newShape);
	}

	public Card(int newNumber) {
		shape = "";
		setNumber(newNumber);
	}

	public Card(String newShape, int newNumber) {
		setShape(newShape);
		setNumber(newNumber);
	}

	public void setShape(String newShape) {
		shape = newShape;
	}

	public String getShape() {
		return shape;
	}

	public void setNumber(int newNumber) {
		number = newNumber;
	}

	public int getNumber() {
		return number;
	}

	public String toString() {
		return "Shape: " + shape + " | Number: " + number;
	}

	public abstract void showMyColor();

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (obj != null && obj instanceof Card) {
			// 인수로 넣은 newShape와 newNumber을 꺼내서 값 비교
			Card otherCard = (Card) obj; // 형변
			if (this.shape.equals(otherCard.shape) && this.number == otherCard.number) {
				isEqual = true;
			}
		}
		return isEqual;
	}
}
