package codingBat;

/**
 * Logic-1 Section ("Basic boolean logic puzzles -- if else && || !")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class Logic1 {
	
	
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40 && cigars <= 60 && !isWeekend) {
			return true;
		} 
		else if (cigars >= 40 && isWeekend) {
			return true;
		}
		return false;
	}
	
	
	public int dateFashion(int you, int date) {
		if ((you >= 8 && date > 2) || (you > 2 && date >= 8)) {
			return 2;
		}
		else if (you <= 2 || date <= 2) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (!isSummer) {
			return temp >= 60 && temp <= 90;
		}
		else {
			return temp >= 60 && temp <= 100;
		}
	}
	
	
	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) {
			if (speed > 85) {
				return 2;
			} 
			else if (speed <= 65) {
				return 0;
			}
			else {
				return 1;
			}
		}
		else {
			if (speed <= 60) {
				return 0;
			} 
			else if (speed > 60 && speed <= 80) {
				return 1;
			} 
			else {
				return 2;
			}
		}
	}
	
	
	public int sortaSum(int a, int b) {
		if (a + b < 10 || a + b > 20) {
			return a + b;
		}
		return 20;
	}
	
	
	public String alarmClock(int day, boolean vacation) {
		if (!vacation) {
			if (day >= 1 && day <=5) {
				return "7:00";
			} 
			else {
				return "10:00";
			}
		}
		else {
			if (day >= 1 && day <=5) {
				return "10:00";
			}
			else {
				return "off";
			}
		}
	}
	
	
	public boolean love6(int a, int b) {
		return (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6);
	}
	
	
	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode) { return n <= 1 || n >= 10; } 
		else { return n >= 1 && n <= 10; }
	}
	
	
	public boolean specialEleven(int n) {
		return (n % 11 == 0 || (n - 1) % 11 == 0);
	}
	
	
	public boolean more20(int n) {
		return ((n - 1) % 20 == 0 || (n - 2) % 20 == 0);
	}
	
	
	public boolean old35(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return false;
		}
		return (n % 3 == 0 || n % 5 == 0);
	}
	
	
	public boolean less20(int n) {
		return ( (n + 1) % 20 == 0 || (n + 2) % 20 == 0 );
	}
	
	
	public boolean nearTen(int num) {
		return (num % 10 <= 2) || (num % 10 >= 8);
	}
	
	
	public int teenSum(int a, int b) {
		if ((a >= 13 && a <=19) || (b >= 13 && b <= 19)) { return 19; }
		else { return (a+b); }
	}
	
	
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		}
		else if (isMorning) {
			return isMom;
		}
		else {
			return true;
		}
	}
	
	
	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5) { return 0; }
		else if (tea >= candy * 2 || candy >= tea * 2) { return 2; }
		else { return 1; }
	}
	
	
	public String fizzString(String str) {
		if (str.startsWith("f") && str.endsWith("b")) {
			return "FizzBuzz";
		}
		else if (str.startsWith("f")) {
			return "Fizz";
		}
		else if (str.endsWith("b")) {
			return "Buzz";
		}
		return str;
	}
	
	
	public String fizzString2(int n) {
		if (n % 15 == 0) {
			return "FizzBuzz!";
		}
		else if (n % 3 == 0) {
			return "Fizz!";
		}
		else if (n % 5 == 0) {
			return "Buzz!";
		}
		return n + "!";
	}
	
	
	public boolean twoAsOne(int a, int b, int c) {
		return (a + b == c) || (a + c == b) || (b + c == a);
	}
	
	
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (b < c && bOk) {
			return true;
		}
		else if (a < b && b < c && !bOk) {
			return true;
		}
		return false;
	}
	
	
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (!equalOk) {
			return a < b && b < c;
		} 
		else {
			return a <= b && b <= c;
		}
	}
	
	
	public boolean lastDigit(int a, int b, int c) {
		return a % 10 == b % 10 || 
				a % 10 == c % 10 || 
				b % 10 == c % 10;
	}
	
	
	public boolean lessBy10(int a, int b, int c) {
        return a + 10 <= b || a + 10 <= c || 
               b + 10 <= a || b + 10 <= c ||
               c + 10 <= a || c + 10 <= b;
	}
	
	
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (!noDoubles) {
			return die1 + die2;
		} 
		
		if (die1 != die2) {
			return die1 + die2;
		} 
		else {
			if (die1 ==6) {
				return 1 + die2;
			}
			return die1 + die2 + 1;
		}
	}
	
	
	public int maxMod5(int a, int b) {
		if ( a % 5 == b % 5 && a != b ) {
			return (a < b) ? a : b;
		} 
		else if ( a % 5 != b % 5 && a != b ) {
			return (a > b && a != b) ? a : b;
		}
		return 0;
	}
	
	
	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2) 	 return 10;
		else if (a == b && b == c) 			 return 5; 
		else if (a != b && a != c) 			 return 1; 
		else 								 return 0; 
	}
	
	
	public int greenTicket(int a, int b, int c) {
		if ( a == b && b == c ) {
			return 20;
		} 
		else if ( a != b && a != c && b != c) {
			return 0;
		} 
		else {
			return 10;
		}
	}
	
	
	public int blueTicket(int a, int b, int c) {
		if ( a + b == 10 || b + c == 10 || a + c == 10) {
			return 10;
		}
		else if ( a + b == b + c + 10 || a + b == a + c + 10) {
			return 5;
		}
		return 0;
	}
	
	
	public boolean shareDigit(int a, int b) {
		return a / 10 == b / 10 || a % 10 == b % 10 || 
				a / 10 == b % 10 || a % 10 == b / 10;
	}
	
	
	public int sumLimit(int a, int b) {
		int aLen = String.valueOf(a).length();
		int sumLen = String.valueOf(a + b).length();		  
		return (aLen == sumLen) ? (a + b) : a;
	}
	
	
}
