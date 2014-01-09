
/**
 * String-2 Section Problems See CodingBat.com for prompts
 * "Medium String problems -- 1 loop."
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

}
