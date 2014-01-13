package codingBat;


/**
 * Recursion-1 Section ("Basic recursion problems")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class Recursion1 {
	
	
	public int factorial(int n) {
		if (n == 1) { return 1; }
		else { return n * factorial(n - 1); }
	}
	
	
	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		return 2 + bunnyEars(bunnies - 1);
	}
	
	
	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	
	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) { 
			return 0; 
		}
		else if (bunnies % 2 == 0) { 
			return 3 + bunnyEars2(bunnies - 1); 
		}
		else { 
			return 2 + bunnyEars2(bunnies - 1); 
		}
	}
	
	
	public int triangle(int rows) {
		if (rows == 0) { return 0; }
		else if (rows == 1) { return 1; }
		else { return rows + triangle(rows - 1); }
	}
	
	
	public int sumDigits(int n) {
		if (n < 10) { return n; }
		else { return (n % 10) + sumDigits(n / 10); }
	}
	
	
	public int count7(int n) {
		if (n < 10) {
			if (n == 7) { return 1; }
			else { return 0; }
		}
		else {
			if (n % 10 == 7) { return 1 + count7(n / 10); }
			else { return count7(n / 10); }
		}
	}
	
	
	public int count8(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n % 10 == 8 && (n / 10) % 10 == 8) {
			return 2 + count8(n / 10);
		}
		else if (n % 10 == 8) {
			return 1 + count8(n / 10);
		}
		return count8(n / 10);
	}
	
	
	public int powerN(int base, int n) {
		if (n == 0) {
			return 1;
		}
		return base * powerN(base, n - 1);
	}
	
	
	public int countX(String str) {
		if (str.equals("")) {
			return 0;
		}
		if (str.endsWith("x")) {
			return 1 + countX(str.substring(0, str.length() - 1));
		}
		return countX(str.substring(0, str.length() - 1));
	}
	
	
	public int countHi(String str) {
		if (str.equals("")) {
			return 0;
		}
		if (str.equals("hi")) {
			return 1;
		}
		if(str.length() >= 2) {
			if ( str.endsWith("hi") ) {
				return 1 + countHi(str.substring(0, str.length() - 1));
			}
			return countHi(str.substring(0, str.length() - 1));
		}
		return 0;
	}
	
	
	public String changeXY(String str) {
		if (str.length() < 1) {
			return "";
		}
		if (str.startsWith("x")) {
			return "y" + changeXY(str.substring(1));
		}
		return str.substring(0, 1) + changeXY(str.substring(1));
	}
	
	
	public String changePi(String str) {
		if (str.length() == 0) {
			return "";
		}
		if (str.length() == 1) {
			return str;
		}
		if (str.startsWith("pi")) {
			return "3.14" + changePi(str.substring(2));
		}
		return str.substring(0, 1) + changePi(str.substring(1));
	}
	
	
	public String noX(String str) {
		if (str.length() == 0) {
			return "";
		}
		if (str.startsWith("x")) {
			return noX(str.substring(1));
		}
		return str.substring(0, 1) + noX(str.substring(1));
	}
	
	
	public boolean array6(int[] nums, int index) {
		if (nums.length == 0) {
			return false;
		}
		else if (index == nums.length - 1) {
			return nums[index] == 6;
		}
		else { 
			if (nums[index] == 6) {
				return true;
			}
			return array6(nums, ++index);
		}
	}
	
	public int array11(int[] nums, int index) {
		if (nums.length == 0) { return 0; }
		else if (index == nums.length - 1) {
			if (nums[index] == 11) { return 1; }
			else { return 0; }
		}
		else {
			if (nums[index] == 11) { return 1 + array11(nums, ++index); }
			else { return 0 + array11(nums, ++index); }
		}
	}
	
	
	public boolean array220(int[] nums, int index) {
		if (index + 1 >= nums.length) {
			return false;
		}
		if (nums[index] * 10 == nums[++index]) {
			return true;
		}
		return array220(nums, index);
	}
	
	
	public String pairStar(String str) {
	    if (str.length() <= 1) {
	        return str;
	    }
	    else if (str.charAt(0) == str.charAt(1)) {
	        return str.charAt(0) + "*" + pairStar(str.substring(1));
	    }
	    else {
	        return str.charAt(0) + pairStar(str.substring(1));
	    }
	}
	
	
	public String endX(String str) {
	    if (str.length() <= 1) { 
	        return str; 
	    }
	    else if (str.charAt(0) == 'x') {
	        return endX(str.substring(1)) + "x";
	    }
	    else {
	        return str.charAt(0) + endX(str.substring(1));
	    }
	}

	
	public int countPairs(String str) {
		if (str.length() <= 2) {
	        return 0;
	    }
	    else if (str.charAt(0) == str.charAt(2)) {
			return 1 + countPairs(str.substring(1));
	    }
	    else {
	        return countPairs(str.substring(1));
	    }
	}
	
	
	public int countAbc(String str) {
		if (str.length() <= 2) {
	        return 0;
	    }
	    else if ( str.startsWith("ab") &&
	             (str.charAt(2) == 'a' || str.charAt(2) == 'c') )  {
	                 return 1 + countAbc(str.substring(1));
	    }
	    else {
	        return countAbc(str.substring(1));
	    }
	}

	
	public int count11(String str) {
		if (str.length() <= 1) {
	        return 0;
	    }
	    else if (str.charAt(0) == '1' && str.charAt(1) == '1') {
			// start at 2 not 1 to avoid counting overlaps
	        return 1 + count11(str.substring(2));
	    }
	    else {
	        return count11(str.substring(1));
	    }
	}


	public String stringClean(String str) {
	  	if (str.length() <= 1) {
	        return str;
	    }
	    else if (str.charAt(0) == str.charAt(1)) {
	        return stringClean(str.substring(1));
	    }
	    else {
			return str.charAt(0) + stringClean(str.substring(1));
	    }

	}

	
	public int countHi2(String str) {
	    if (str.length() <= 1) {
	        return 0;
	    }
	    else if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
	        return 1 + countHi2(str.substring(2));
	    }
	    else if (str.charAt(1) == 'h' && str.charAt(2) == 'i') {
			if (str.charAt(0) == 'x') {
				return countHi2(str.substring(3));
	        }
	        else {
	            return 1 + countHi2(str.substring(3));
	        }
	    }
	    else {
	        return countHi2(str.substring(1));
	    }
	}
	
	
	public String parenBit(String str) {
	    if (str.charAt(0) == ')') {
	        return ")";
	    }
	    else if (str.charAt(0) == '(') {
	        return "(" + parenBit(str.substring(1));
	    }
	    // if the remaining string doesn't have '(', its inside the parentheses
	    else if (!str.contains("(")) {
			return str.charAt(0) + parenBit(str.substring(1));
	    }
	    else {
	        return parenBit(str.substring(1));
	    }
	}

	
	public boolean nestParen(String str) {
	    if (str.length() == 0) {
	        return true;
	    }
		if (str.length() == 1 && str.charAt(0) != ')' && str.charAt(0) != '(') { 
	        return true; 
	    }
	    else if (str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
	        return false;
	    }
	    else {
	        return nestParen(str.substring(1, str.length() - 1));
	    }
	}

	
	public int strCount(String str, String sub) {
		int subLen = sub.length();
	    int strLen = str.length();
		if (strLen < subLen) {
	        return 0;
	    }
	    else if (str.substring(0, subLen).equals(sub)) {
	        return 1 + strCount(str.substring(subLen), sub);
	    }
	    else {
			return strCount(str.substring(1), sub);
	    }
	}

	
	public boolean strCopies(String str, String sub, int n) {
		int strLen = str.length();
	    int subLen = sub.length();

	    if (strLen < subLen) {
	        if (n <= 0) {
		    	return true;
	        }
	        return false;
	    }
	    else if (str.substring(0, subLen).equals(sub)) {
	        return strCopies(str.substring(1), sub, --n);
	    }
	    else {
	        return strCopies(str.substring(1), sub, n);
	    }
	}
	
	
	public int strDist(String str, String sub) {
		if (str.length() < sub.length()) {
	        return 0;
	    }
		if (str.substring(0, sub.length()).equals(sub)) {
	        // if end is substring, return current strLen
			if (str.substring(str.length() - sub.length()).equals(sub)) {
	            return str.length();
	        }
	        else {
				return strDist(str.substring(0, str.length() - 1), sub);
	        }
		}
	    else {
	    	return strDist(str.substring(1), sub);
	    }
	}


	
}

