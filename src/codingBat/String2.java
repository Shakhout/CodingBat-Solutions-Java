package codingBat;

/**
 * String-2 Section ("Medium String problems -- 1 loop")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class String2 {
	
	
	public String doubleChar(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr += str.charAt(i);
			newStr += str.charAt(i);
		}
		return newStr;
	}
	
	
	public int countHi(String str) {
		int hiCt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.substring(i, i + 2).equals("hi")) {
				hiCt++;
			}
		}
		return hiCt;
	}
	
	
	public boolean catDog(String str) {
		int cats = 0;
		int dogs = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				cats++;
			}
			if (str.substring(i, i + 3).equals("dog")) {
				dogs++;
			}
		}
		return cats == dogs;
	}
	
	
	public int countCode(String str) {
		int ct = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && 
					str.substring(i + 3, i + 4).equals("e")) {
				ct++;
			}
		}
		return ct;
	}
	
	
	public boolean endOther(String a, String b) {
		String aLo = a.toLowerCase();
		String bLo = b.toLowerCase();
		return aLo.endsWith(bLo) || bLo.endsWith(aLo);
	}
	
	
	public boolean xyzThere(String str) {
		if (str.startsWith("xyz")) {
			return true; 
		}
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) != '.' && str.substring(i + 1, i + 4).equals("xyz")) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean xyBalance(String str) {
		boolean balanced = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				balanced = str.substring(i).contains("y");
			}
		}
		return balanced;
	}
	
	
	public String mixString(String a, String b) {
		String newStr = "";
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				newStr += a.charAt(i);
				newStr += b.charAt(i);
			}
		}
		else if (a.length() > b.length()) {
			for (int i = 0; i < b.length(); i++) {
				newStr += a.charAt(i);
				newStr += b.charAt(i);
			}
			newStr += a.substring(b.length());
		}
		else {
			for (int i = 0; i < a.length(); i++) {
				newStr += a.charAt(i);
				newStr += b.charAt(i);
			}
			newStr += b.substring(a.length());
		}
		return newStr;
	}
	
	
	public String repeatEnd(String str, int n) {
		String newStr = "";
		String cut = "";
		cut = str.substring(str.length() - n, str.length());
		for (int i = 0; i < n; i++) {
			newStr += cut;
		}
		return newStr;
	}
	
	
	public String repeatFront(String str, int n) {
		String result = "";
		for (int i = n; i >= 1; i--) {
			result += str.substring(0, i);
		}
		return result;
	}
	
	
	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		if (str.length() == 2 && str.charAt(0) == str.charAt(1) ) {
			return true;
		}
		
		for (int i = 1; i < str.length() - n; i++) {
			if (i + n < str.length() && str.substring(i, i + n).equals(prefix)) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean xyzMiddle(String str) {
		// Base Cases
		if (str.length() < 3) {
			return false;
		}
		else if (str.length() == 3 || str.length() == 4) {
			return str.contains("xyz");
		}
		// Recursive Case: chop off first and last chars
		else {
			return xyzMiddle(str.substring(1, str.length() - 1));
		}
	}
	
	
	/** Recursive solution -- simpler */
	public String getSandwich(String str) {
		if (str.length() < 10) { 	// bread + bread = 10 chars. Min len == 10
			return "";
		}
		// Case 1: "bread____bread_"
		else if (str.startsWith("bread") && !str.endsWith("bread")) {
			// trim last char
			return getSandwich(str.substring(0, str.length() - 1));
		}
		// Case 2: "_bread____bread"
		else if (!str.startsWith("bread") && str.endsWith("bread")) {
			// trim first char
			return getSandwich(str.substring(1));
		}
		// Case 3: "_bread____bread_"
		else if (!str.startsWith("bread") && !str.endsWith("bread")) {
			// trim first and last char
			return getSandwich(str.substring(1, str.length() - 1));
		}
		// "bread______bread", return interior
		else {
			return str.substring(5, str.length() - 5);
		}
	}
	
	
	/** Nonrecursive solution */
	public String getSandwichNonRecursive(String str) {
		int first = 0; //first and last indexes of sandwich
		int last = 1;
		int i, j;
		boolean oneFound = false;
		boolean twoFound = false;
		
		// find first bread
		for (i = 0; i <= str.length() - 5; i++) {
			if (str.substring(i, i + 5).equals("bread")) {
				oneFound = true;
				first = i + 5;
				break;
			}
		}
		
		if (!oneFound) { return ""; }
		// find second bread
		for (j = str.length() - 5; j > 0; j--) {
			if (str.substring(j, j + 5).equals("bread")) {
				twoFound = true;
				last = j - 1;
				break;
			}
		}
		
		if (!twoFound) { return ""; }
		
		if (first <= last) {
			return str.substring(first, last + 1);
		}
		
		return "";
	}
	
	
	public boolean sameStarChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {
				if (i - 1 >= 0 && i + 1 <= str.length() - 1 &&
						str.charAt(i - 1) != str.charAt(i + 1)) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public String zipZap(String str) {
		String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.length() > 2 && i < str.length() - 2 &&
					str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				newstr += "zp";
				i += 2;
			}
			else {
				newstr += str.charAt(i);
			}
		}
		return newstr;
	}
	
	
	public String starOut(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (i - 1 >= 0 && str.charAt(i - 1) == '*') {
				continue;
			}
			else if (i + 1 <= str.length() - 1 && str.charAt(i + 1) == '*') {
				continue;
			}
			else if (str.charAt(i) == '*') {
				continue;
			}
			else {
				newStr += str.charAt(i);
			}
		}
		return newStr; 
	}
	
	
	public String plusOut(String str, String word) {
		String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			if (i + word.length() - 1 < str.length() &&
					str.substring(i, i + word.length()).equals(word)) {
				newstr += word;
				i += word.length() - 1;
			}
			else {
				newstr += "+";
			}
		}
		return newstr;
	}
	
	
	public String wordEnds(String str, String word) {  
		int sLen = str.length();
		int wLen = word.length();
		int i;
		String result = "";
		
		for (i = 0; i + wLen <= sLen; i++) {
			if (str.substring(i, i + wLen).equals(word)) {  // find word
				if (i != 0) {                  // get prev char if not at beginning
					result += str.substring(i - 1, i);
				}
				if (i + wLen < sLen) {    // get post char if not at end
					result += str.substring(i + wLen, i + wLen + 1);
				}
			}
		}	
		return result;
		
	}
	
	
	public String mirrorEnds(String string) {
		int x = 0;
		while (x < string.length()) {
			if (string.charAt(x) == string.charAt(string.length() - 1 - x)) {
				x++;
			}
			else {
				break;
			}
		}
		return string.substring(0, x);
	}
	
	
	public int maxBlock(String str) {
		if (str.length() == 0) { return 0; }
		int maxRun = 1;
		int currentRun = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentRun++;
				if (currentRun > maxRun) {
					maxRun = currentRun;
				}
			} 
			else {
				currentRun = 1;
			}
		}
		return maxRun;
	}
	
	
	public int sumNumbers(String str) {
		int sum = 0;
		String current = "";
		for (int i = 0; i < str.length(); i++) {
	    	if (Character.isDigit(str.charAt(i))) {
	      		current += str.charAt(i);
	      		while ( i + 1 < str.length() && Character.isDigit(str.charAt(i + 1)) ) {
	        		current += str.charAt(i + 1);
	        		i++;
	      		}
	    		sum += Integer.parseInt(current);
	    		current = "";
	    	}
	  	}
	  	return sum;
	}
	
	
	/** Using regex is best way to approach this deceptively tricky prob */
	public String notReplace(String str) {
		return str.replaceAll("(?<!\\w)is(?!\\w)", "is not");
	} 


	
	
}
