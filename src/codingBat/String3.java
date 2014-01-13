package codingBat;


/**
 * String-3 Section ("Harder String problems -- 2 loops")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 11, 2014
 */
public class String3 {

	
	public int countYZ(String str) {
		int ctYZ = 0;
	    for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'y' || str.charAt(i) == 'Y' ||
	            str.charAt(i) == 'z' || str.charAt(i) == 'Z') {
	            if (i + 1 < str.length() && !Character.isLetter(str.charAt(i + 1))) { 
		            ctYZ++;
	            }
	            else if (i + 1 >= str.length()) {
	                ctYZ++;
	            }
	        }
	    }
	    return ctYZ;
	}

	
	public String withoutString(String base, String remove) {
	    String newStr = "";
	    for (int i = 0; i < base.length(); i++) {
			if ( !base.substring(i).toLowerCase().startsWith(remove.toLowerCase()) ) {
	            newStr += base.charAt(i);
	        }
	        else {
				i += remove.length() - 1;
	        }
	    }
	    return newStr;
	}

	
	public boolean equalIsNot(String str) {
		int isCt = 0;
	    int notCt = 0;
	    for (int i = 0; i < str.length(); i++) {
	        if ( i + 1 < str.length() && str.substring(i, i + 2).equals("is") ) {
	            isCt++;
	        }
	        if ( i + 2 < str.length() && str.substring(i, i + 3).equals("not") ) {
	            notCt++;
	        }
	    }
	    return isCt == notCt;
	}
	
	
	public boolean gHappy(String str) {
	    boolean happy = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
	            happy = false;
				if (i - 1 >= 0 && str.charAt(i - 1) == 'g') {
	                happy = true;
	            }
	            if (i + 1 <= str.length() - 1 && str.charAt(i + 1) == 'g') {
	                happy = true;
	            }
	            if (!happy) { return false; }
	        }
	    }
	    return true;
	}

	
	public int countTriple(String str) {
		int triples = 0;
	    for (int i = 0; i < str.length() - 2; i++) {
	        if ( str.charAt(i + 1) == str.charAt(i) && 
	             str.charAt(i + 2) == str.charAt(i) ) {
					triples++;
	        }
	    }
	    return triples;
	}
	
	
	public int sumDigits(String str) {
	    int sum = 0;
	    for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
	            sum += Character.getNumericValue(str.charAt(i));
	        }
	    }
	    return sum;
	}

	
	public String sameEnds(String string) {
	    int maxLen = 0;
	    int x = 1;
	    while (x <= string.length() / 2) {
			String sub = string.substring(0, x);
	        if (string.startsWith(sub) && string.endsWith(sub)) {
	            maxLen = x;
	        }
	        x++;
	    }
	    return (maxLen > 0) ? string.substring(0, maxLen) : "";
	}


	
}
