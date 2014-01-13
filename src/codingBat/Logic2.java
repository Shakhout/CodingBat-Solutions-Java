package codingBat;


/**
 * Logic-2 Section ("Medium boolean logic puzzles")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class Logic2 {
	
	
	public boolean makeBricks(int small, int big, int goal) {
		if (small >= goal) {
			return true;
		}
		
		int numLeft = goal;
		// use all big blocks first, then check if enough small
		// to cover remainder
		while (numLeft >= 5 && big > 0) {
			--big;
			numLeft -= 5; 
		}
		if (numLeft <= small) {
			return true;
		}
		return false;
	}
	
	
	public int loneSum(int a, int b, int c) {
		boolean allDifferent = (a != b && a != c && b != c) ? true : false;
		if (allDifferent) {
			return a + b + c;
		}
		else {
			// all same
			if (a == b && b == c) 	return 0;
			// a and b same
			else if (a == b)        return c;
			// b and c same
			else if (b == c)        return a;
			// a and c same
			else					return b;
		}
	}
	
	
	public int luckySum(int a, int b, int c) {
		if (a == 13)        { return 0; }
		else if (b == 13)   { return a; }
		else if (c == 13)   { return a + b; }
		else                { return a + b + c; }
	}
	
	
	public int noTeenSum(int a, int b, int c) {
		a = fixTeen(a);
		b = fixTeen(b);
		c = fixTeen(c);
		return a + b + c;
	}
	/** Helper method for noTeenSum */
	public int fixTeen(int n) {
		if ( ( n >= 13 && n < 15 ) || ( n >= 17 && n <= 19 ) ) {
			n = 0;
		}
		return n;
	}
	
	
	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c); 
	}
	/** Helper method for roundSum */
	public int round10(int num) {
		if (num % 10 >= 5) {
			num = (num / 10 + 1) * 10;
		} 
		else {
			num = (num / 10) * 10;
		}
		return num;
	}
	
	
	public boolean closeFar(int a, int b, int c) {
		// a & b close; c far
		if (Math.abs(a - b) <= 1 && Math.abs(b - c) >= 2 && Math.abs(a - c) >= 2) {
			return true;
		}
		// b & c close; a far
		else if (Math.abs(b - c) <= 1 && Math.abs(b - a) >= 2 && Math.abs(c - a) >= 2) {
			return true;
		}
		// a & c close; b far
		else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int blackjack(int a, int b) {
		if ( a > 21 && b > 21 ) {	// both over
			return 0;
		}
		else if ( a <= 21 && b > 21 ) { // a under, b over
			return a;
		}
		else if ( b <= 21 && a > 21 ) { // b under, a over
			return b;
		}
		else { // both under
			return ( 21 - a < 21 - b ) ? a : b;
		}
	}
	
	
	public boolean evenlySpaced(int a, int b, int c) {
		// Note: assuming that numbers a, b, & c cannot be equal
		int small, medium, large;
		// a small
		if ( a < b && a < c ) { 
			small = a;
			medium = ( b < c ) ? b : c;
			large = ( b > c ) ? b : c;
		}
		// b small
		else if ( b < a && b < c ) {
			small = b;
			medium = ( a < c ) ? a : c;
			large = ( a > c ) ? a : c;
		}
		// c small
		else {
			small = c;
			medium = ( a < b ) ? a : b;
			large = ( a > b ) ? a : b;
		}
		return ( medium - small ) == ( large - medium );
	}
	
	
	public int makeChocolate(int small, int big, int goal) {
		
		int remainingKilos = goal;
		// use big bars first
		while ( big > 0 && remainingKilos >= 5 ) {
			--big;
			remainingKilos -= 5;
		}
		
		// Possible if we have enough small bars to meet remaining quota 
		if ( remainingKilos <= small ) {
			return remainingKilos;
		}
		else { return -1; }
		
	}
	

}
