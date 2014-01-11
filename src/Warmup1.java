/**
 * Warmup-1 Section Problems See CodingBat.com for prompts
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */

public class Warmup1 {
	
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
	
	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return (aSmile && bSmile) || (!aSmile && !bSmile);
	}
	
	
	public int sumDouble(int a, int b) {
		return (a == b) ? 2 * (a + b) : (a + b);
	}
	
	
	public int diff21(int n) {
		if (n > 21) {
			return Math.abs(n - 21) * 2;
		}
		return Math.abs(n - 21);
	}
	
	
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}
	
	
	public boolean makes10(int a, int b) {
		return a == 10 || b == 10 || a + b == 10;
	}
	
	
	public boolean nearHundred(int n) {
		return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
	}
	
	
	public boolean posNeg(int a, int b, boolean negative) {
		if (!negative) {
			return (a < 0 && b > 0) || (b < 0 && a > 0);
		}
		else {
			return a < 0 && b < 0;
		}
	}
	
	
	public String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		}
		else {
			return "not " + str;
		}
	}
	
	
	public String missingChar(String str, int n) {
		String front = str.substring(0, n);
		String back = str.substring(n + 1, str.length());
		return front + back;
	}
	
	
	public String frontBack(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return str.substring(str.length() - 1) +
				str.substring(1, str.length() - 1) +
				str.substring(0, 1);
	}
	
	
	public String front3(String str) {
		String front = str.length() >= 3 ? str.substring(0, 3) : str;
		return front + front + front;
	}
	
	
	public String backAround(String str) {
		String back = str.substring(str.length() - 1, str.length());
		String front = str.substring(0, str.length());
		return back + front + back;
	}
	
	
	public boolean or35(int n) {
		return n % 3 == 0 || n % 5 == 0;
	}
	
	
	public String front22(String str) {
		if (str.length() < 2) {
			return str + str + str;
		}
		else {
			String f2 = str.substring(0, 2);
			return f2 + str + f2;
		}
	}
	
	
	public boolean startHi(String str) {
		return str.length() >= 2 && str.substring(0, 2).equals("hi");
	}
	
	
	public boolean icyHot(int temp1, int temp2) {
		return temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0;
	}
	
	
	public boolean in1020(int a, int b) {
		return 10 <= a && a <= 20 || 10 <= b && b <= 20;
	}
	
	
	public boolean hasTeen(int a, int b, int c) {
		return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
	}
	
	
	public boolean loneTeen(int a, int b) {
		boolean aTeen = a > 12 && a < 20;
		boolean bTeen = b > 12 && b < 20;
		
		return aTeen && !bTeen || bTeen && !aTeen;
	}
	
	
	public String delDel(String str) {
		if (str.length() > 3 && str.substring(1, 4).equals("del")) {
			str = str.substring(0, 1) + str.substring(4, str.length());
		}
		return str;
	}
	
	
	public boolean mixStart(String str) {
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("ix")) {
				return true;
			}
		}
		return false;
	}
	
	
	public String startOz(String str) {
		String nStr = "";
		if (str.length() > 0 && str.charAt(0) == 'o') {
			nStr += "o";
		}
		if (str.length() > 1 && str.charAt(1) == 'z') {
			nStr += "z";
		}
		return nStr;
	}
	
	
	public int intMax(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		}
		else if (b > a && b > c) {
			return b;
		}
		else {
			return c;
		}
	}
	
	
	public int close10(int a, int b) {
		if (Math.abs(10 - a) < Math.abs(10 - b)) {
			return a;
		}
		else if (Math.abs(10 - a) > Math.abs(10 - b)) {
			return b;
		}
		else {
			return 0;
		}
	}
	
	
	public boolean in3050(int a, int b) {
		boolean a3040 = a >= 30 && a <= 40;
		boolean b3040 = b >= 30 && b <= 40;
		boolean a4050 = a >= 40 && a <= 50;
		boolean b4050 = b >= 40 && b <= 50;
		return a3040 && b3040 || a4050 && b4050;
	}
	
	
	public int max1020(int a, int b) {
		boolean a1020 = a >= 10 && a <= 20;
		boolean b1020 = b >= 10 && b <= 20;
		if (a1020 && b1020) {
			return a > b ? a : b;
		}
		else if (a1020) {
			return a;
		}
		else if (b1020) {
			return b;
		}
		else {
			return 0;
		}
	}
	
	
	public boolean stringE(String str) {
		int eCt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				eCt++;
			}
		}
		return eCt >= 1 && eCt <= 3;
	}
	
	
	public boolean lastDigit(int a, int b) {
		return a % 10 == b % 10;
	}
	
	
	public String endUp(String str) {
		if (str.length() > 3) {
			return str.substring(0, str.length() - 3)
					+ str.substring(str.length() - 3,
							str.length()).toUpperCase();
		}
		else {
			return str.toUpperCase();
		}
	}
	
	
	public String everyNth(String str, int n) {
		int i = 0;
		String str2 = "";
		while (i < str.length()) {
			str2 += str.charAt(i);
			i += n;
		}
		return str2;
	}
	
	
}
