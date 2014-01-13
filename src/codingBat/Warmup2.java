package codingBat;
/**
 * Warmup-2 Section ("Medium warmup string/array loops")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class Warmup2 {
	
	
	public String stringTimes(String str, int n) {
		String newStr = "";
		for (int i = 0; i < n; i++) {
			newStr += str;
		}
		return newStr;
	}
	
	
	public String frontTimes(String str, int n) {
		String newStr = "";
		for (int i = 0; i < n; i++) {
			if (str.length() < 3) {
				newStr += str.substring(0, str.length());
			}
			else {
				newStr += str.substring(0, 3);
			}
		}
		return newStr;
	}
	
	
	int countXX(String str) {
		int xxCount = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
				xxCount++;
			}
		}
		return xxCount;
	}
	
	
	boolean doubleX(String str) {
		int xCt = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				xCt++;
				if (xCt == 1 && str.charAt(i + 1) == 'x') {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public String stringBits(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i += 2) {
			newStr += str.charAt(i);
		}
		return newStr;
	}
	
	
	public String stringSplosion(String str) {
		String newStr = "";
		for (int n = 1; n <= str.length(); n++) {
			newStr += str.substring(0, 0 + n);
		}
		return newStr;
	}
	
	
	public int last2(String str) {
		int ct = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String pattern = str.substring(str.length() - 2, str.length());
			if (str.length() > 1 && str.substring(i, i + 2).equals(pattern)) {
				ct++;
			}
		}
		return ct;
	}
	
	
	public int arrayCount9(int[] nums) {
		int nines = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				nines++;
			}
		}
		return nines;
	}
	
	
	public boolean arrayFront9(int[] nums) {
		if (nums.length < 4) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 9) {
					return true;
				}
			}
		}
		else {
			for (int i = 0; i < 4; i++) {
				if (nums[i] == 9) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}
	
	
	public int stringMatch(String a, String b) {
		int shorterLen = a.length();
		if (b.length() < a.length()) {
			shorterLen = b.length();
		}
		
		int matchCt = 0;
		for (int i = 0; i < shorterLen - 1; i++) {
			if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
				matchCt++;
			}
		}
		return matchCt;
	}
	
	
	public String stringX(String str) {
		String newStr = "";
		if (str.length() > 0 && str.charAt(0) == 'x') {
			newStr += "x";
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'x') {
				newStr += str.charAt(i);
			}
		}
		if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
			newStr += "x";
		}
		return newStr;
	}
	
	
	public String altPairs(String str) {
		String newStr = "";
		int i = 0;
		if (str.length() <= 2) {
			return str;
		}
		while (i < str.length()) {
			if (i == str.length() - 1) {
				newStr += str.substring(i, i + 1);
			}
			else if (i + 1 <= str.length() - 1) {
				newStr += str.substring(i, i + 2);
			}
			i += 4;
		}
		return newStr;
	}
	
	
	public String stringYak(String str) {
		String a = "";
		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == 'y'
					&& str.charAt(i + 2) == 'k') {
				i += 2;
			}
			else {
				a += str.charAt(i);
			}
		}
		return a;
	}
	
	
	public int array667(int[] nums) {
		int ct = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
				ct++;
			}
		}
		return ct;
	}
	
	
	public boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean has271(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] + 5 == nums[i + 1] && nums[i + 2] <= nums[i] + 1
				                           && nums[i + 2] >= nums[i] - 3) {
				return true;
			}
		}
		return false;
	}
	
	
}
