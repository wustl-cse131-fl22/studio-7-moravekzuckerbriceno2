package studio7;

public class Die {

	private int n;
	
	public Die(int Sides) {
		n = Sides;
	}
	public int Throw() {
		int integer = int (Math.random()n-1) + 1;
		return integer;
	}
}
