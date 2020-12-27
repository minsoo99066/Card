package Poker;

public class Red extends Card {
	public Red(String newShape, int newNumber) {
		//super는 부모의 constructor 불러오는 것
		super(newShape, newNumber);
	}

	@Override
	public void showMyColor() {
		System.out.println("Red");
	}
	
	// Prac
}
