/**
 * String-1 Section Problems See CodingBat.com for prompts
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */

public class String1 {
	
	
	public String helloName(String name) {
		return "Hello " + name + "!";
	}
	
	
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}
	
	
	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}
	
	
	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2, 4);
	}
	
	
	public String extraEnd(String str) {
		int len = str.length();
		String last2 = str.substring(len - 2, len);
		return last2 + last2 + last2;
	}
	
	
	public String firstTwo(String str) {
		if (str.length() == 0) {
			return "";
		}
		else if (str.length() == 1) {
			return str.substring(0, 1);
		}
		else {
			return str.substring(0, 2);
		}
	}
	
	
	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}
	
	
	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}
	
	
	public String comboString(String a, String b) {
		if (a.length() > b.length()) {
			return b + a + b;
		}
		else {
			return a + b + a;
		}
	}
	
	
	public String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}
	
	
	public String left2(String str) {
		if (str.length() == 2) {
			return str;
		}
		else {
			return str.substring(2, str.length()) + str.substring(0, 2);
		}
	}
	
	
	public String right2(String str) {
		if (str.length() == 2) {
			return str;
		}
		else {
			return str.substring(str.length() - 2, str.length())
					+ str.substring(0, str.length() - 2);
		}
	}
	
	
	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		}
		return str.substring(str.length() - 1, str.length());
	}
	
	
	public String withouEnd2(String str) {
		String newStr = "";
		if (str.length() > 0) {
			for (int i = 1; i < str.length() - 1; i++) {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}
	
	
	public String middleTwo(String str) {
		if (str.length() == 2) {
			return str;
		}
		else {
			int totalLen = str.length();
			int side = (totalLen - 2) / 2;
			return str.substring(side, totalLen - side);
		}
	}
	
	
	public boolean endsLy(String str) {
		if (str.length() >= 2 && str.substring(str.length() - 2,
				str.length()).equals("ly")) {
			return true;
		}
		return false;
	}
	
	
	public String nTwice(String str, int n) {
		String newStr = "";
		newStr +=
				str.substring(0, n)
						+ str.substring(str.length() - n, str.length());
		return newStr;
	}
	
	
	public String twoChar(String str, int index) {
		int Len = str.length();
		if (Len >= index + 2 && index > 0) {
			return str.substring(index, index + 2);
		}
		else {
			return str.substring(0, 2);
		}
	}
	
	
	public String middleThree(String str) {
		int totalRem = str.length() - 3;
		int sideRem = totalRem / 2;
		return str.substring(sideRem, str.length() - sideRem);
	}
	
	
	public boolean hasBad(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
			return true;
		}
		else if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
			return true;
		}
		return false;
	}
	
	
	public String atFirst(String str) {
		if (str.length() == 0) {
			return "@@";
		}
		else if (str.length() == 1) {
			return str + "@";
		}
		else {
			return str.substring(0, 2);
		}
	}
	
	
	public String lastChars(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		String newStr = "";
		if (aLen > 0 && bLen > 0) {
			newStr = a.substring(0, 1) + b.substring(bLen - 1, bLen);
		}
		else if (aLen > 0 && bLen == 0) {
			newStr = a.substring(0, 1) + "@";
		}
		else if (aLen == 0 && bLen > 0) {
			newStr = "@" + b.substring(bLen - 1, bLen);
		}
		else {
			newStr = "@" + "@";
		}
		return newStr;
	}
	
	
	public String conCat(String a, String b) {		
		if (a.length() == 0 || b.length() == 0) {
			return a + b;
		}
		else {
			char lastA = a.charAt(a.length() - 1);
			char firstB = b.charAt(0);
			
			if (lastA != firstB) {
				return a + b;
			}
			else {
				return a + b.substring(1);
			}
		}
	}
	
	
	public String lastTwo(String str) {
		if (str.length() >= 2) {
			str =
					str.substring(0, str.length() - 2)
							+ str.charAt(str.length() - 1) +
							str.charAt(str.length() - 2);
		}
		return str;
	}
	
	
	public String seeColor(String str) {
		if (str.startsWith("red")) {
			return "red";
		}
		else if (str.startsWith("blue")) {
			return "blue";
		}
		return "";
	}
	
	
	public boolean frontAgain(String str) {
		if (str.length() >= 2) {
			String last2 = str.substring(str.length() - 2, str.length());
			return str.substring(0, 2).equals(last2);
		}
		return false;
	}
	
	
	public String minCat(String a, String b) {
		if (a.length() == b.length()) {
			return a + b;
		}
		else {
			if (a.length() < b.length()) {
				return a + b.substring(b.length() - a.length());
			}
			else {
				return a.substring(a.length() - b.length()) + b;
			}
		}
	}
	
	
	public String extraFront(String str) {
		if (str.length() < 2) {
			return str + str + str;
		}
		else {
			String first2 = str.substring(0, 2);
			return first2 + first2 + first2;
		}
	}
	
	
	public String without2(String str) {
		if (str.length() > 2 &&
				str.substring(0, 2).equals(str.substring(str.length() - 2,
						str.length()))) {
			return str.substring(2);
		}
		else if (str.length() == 2) {
			return "";
		}
		else {
			return str;
		}
	}
	
	
	public String deFront(String str) {
		if (str.length() < 2) {
			return str;
		}
		
		String tail = str.substring(2);
		if (str.startsWith("a") && str.substring(1, 2).equals("b")) {
			return "ab" + tail;
		}
		else if (str.startsWith("a")) {
			return "a" + tail;
		}
		else if (str.substring(1, 2).equals("b")) {
			return "b" + tail;
		}
		else {
			return tail;
		}
	}
	
	
	public String startWord(String str, String word) {
		boolean match = false;
		if (str.length() >= word.length() &&
				word.substring(1).equals(str.substring(1, word.length()))) {
			match = true;
		}
		return match ? str.substring(0, word.length()) : "";
	}
	
	
	public String withoutX(String str) {
		if (str.length() == 0) {
			return str;
		}
		String first = str.startsWith("x") ? "" : str.substring(0, 1);
		if (str.length() == 1) {
			return first;
		}
		String last = str.endsWith("x") ? "" : str.substring(str.length() - 1);
		return first + str.substring(1, str.length() - 1) + last;
	}
	
	 
	public String withoutX2(String str) {
		if (str.length() == 0) {
			return "";
		}
		else if (str.length() == 1) {
			return str.startsWith("x") ? "" : str;
		}
		else {
			String first = str.startsWith("x") ? "" : str.substring(0, 1);
			String second = str.charAt(1) == 'x' ? "" : str.substring(1, 2);
			if (str.length() == 2) {
				return first + second;
			}
			else {
				return first + second + str.substring(2);
			}
		}
	}
	
}
