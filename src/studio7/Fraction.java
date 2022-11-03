package studio7;

public class Fraction {

	private int numerator;
	private int denominator; 

	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}
	public int Multiply(Fraction F) {
		F.getNumerator();
		F.getDenominator();
		int multNum = numerator * F.numerator;
		int multDen = denominator * F.denominator;
		int mult = multNum/multDen;
		return mult;
		
	} 

	public int getNumerator () {
		return this.numerator;
	}
	public int getDenominator () {
		return this.denominator;
	}
}
