package codingBat;

import java.util.ArrayList;
import java.util.List;


/**
 * AP-1 Section ("AP CS medium problems")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class AP1 {
	
	
	public boolean scoresIncreasing(int[] scores) {
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < scores[i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean scores100(int[] scores) {
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] == 100 && scores[i - 1] == 100) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean scoresClump(int[] scores) {
		for (int i = 2; i < scores.length; i++) {
			if (Math.abs(scores[i] - scores[i - 1]) <= 2 &&
					Math.abs(scores[i] - scores[i - 2]) <= 2 &&
					Math.abs(scores[i - 1] - scores[i - 2]) <= 2) {
				return true;
			}
		}
		return false;
	}
	
	
	public int scoresAverage(int[] scores) {
		int firstHalfAvg = average(scores, 0, scores.length / 2 - 1);
		int secondHalfAvg = average(scores, scores.length / 2, scores.length - 1);
		return (firstHalfAvg >= secondHalfAvg) ? firstHalfAvg : secondHalfAvg;
	}
	/** Helper method for scoresAverage */
	private int average(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += scores[i];
		}
		return sum / (end - start + 1);
	}
	
	
	public int wordsCount(String[] words, int len) {
		int ct = 0;
		for (String string : words) {
			if (string.length() == len) {
				ct++;
			} 
		}
		return ct;
	}
	
	
	public String[] wordsFront(String[] words, int n) {
		String[] newArray = new String[n];
		for (int i = 0; i < n; i++) {
			newArray[i] = words[i];
		}
		return newArray;
	}
	
	
	public List<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> list = new ArrayList<String>();
		for (String str : words) {
			if (str.length() != len) {
				list.add(str);
			}
		}
		return list;
	}
	
	
	public boolean hasOne(int n) {
		String intStr = String.valueOf(n);
		int length = intStr.length();
		for (int i = 0; i < length; i++) {
			if (intStr.charAt(i) == '1') {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean dividesSelf(int n) {
		String intStr = String.valueOf(n);
		for (int i = 0; i < intStr.length(); i++) {
			char currentChar = intStr.charAt(i);
			int currentDigit = Character.getNumericValue(currentChar);
			if (currentChar == '0' || n % currentDigit != 0) {
				return false;
			}
		}
		return true;
	}
	
	
	/** A very different approach to dividesSelf */
	public boolean dividesSelfAlt(int n) {
		int origN = n;
		while (n > 0) {
			// Problem says any number with a 0 in it should return false
			if (n % 10 == 0) { 
				return false; 
			}
			if (origN % (n % 10) != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}
	
	
	public int[] copyEvens(int[] nums, int count) {
		int[] newArray = new int[count];
		int newArrayIdx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0 && newArrayIdx < count) {
				newArray[newArrayIdx] = nums[i];
				newArrayIdx++;
			}
		}
		return newArray;
	}
	
	
	public int[] copyEndy(int[] nums, int count) {
		int[] A = new int[count];
		int added = 0;
		for (int i = 0; i < nums.length; i++) {
			if (isEndy(nums[i])) {
				A[added] = nums[i];
				added++;
			}
			if (added == count) {
				return A;
			}
		}
		return A;
	}
	/** Helper method for copyEndy */
	private boolean isEndy(int num) {
		return ( (num <= 10) || (num >= 90 && num <= 100) );
	}
	
	
	public int matchUp(String[] a, String[] b) {
		int sameCt = 0;
		int shorterLen = a.length >= b.length ? a.length : b.length;
		for (int i = 0; i < shorterLen; i++) {
			if (a[i].length() > 0 && b[i].length() > 0 &&
					a[i].charAt(0) == b[i].charAt(0)) {
				sameCt++;
			}
		}
		return sameCt;
	}
	
	
	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for (int i = 0; i < key.length; i++) {
			if (answers[i].equals(key[i])) {
				score += 4;
			}
			else if (answers[i].equals("?")) { }
			else { 
				score -= 1;
			}
		}
		return score;
	}
	
	
	public String[] wordsWithout(String[] words, String target) {
		int ct = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) { ct++; }
		}
		int newLen = words.length - ct;
		String[] A = new String[newLen];
		int copied = 0;
		for (int i = 0; i < words.length && copied < newLen; i++) {
			if (!(words[i].equals(target))) {
				A[copied++] = words[i];
			}
		}
		return A;
	}
	
	
	public int scoresSpecial(int[] a, int[] b) {
		return largestSpecial(a) + largestSpecial(b);
	}
	/** Helper for scoresSpecial */
	private int largestSpecial(int[] array) {
		int largestSpecial = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 10 == 0 && array[i] > largestSpecial) {
				largestSpecial = array[i];
			}
		}
		return largestSpecial;
	}
	
	
	public int sumHeights(int[] heights, int start, int end) {
		int diff = 0;
		for (int i = start; i < end; i++) {
			diff += Math.abs(heights[i] - heights[i + 1]);
		}
		return diff;
	}
	
	
	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (heights[i + 1] >= heights[i]) {
				sum += 2*(heights[i + 1] - heights[i]);
			}
			else {
				sum += heights[i] - heights[i + 1];
			}
		}
		return sum;
	}
	
	
	public int bigHeights(int[] heights, int start, int end) {
		int diff = 0;
		int delta;
		for (int i = start; i < end; i++) {
			delta = Math.abs(heights[i] - heights[i + 1]);
			if (delta >= 5) { diff++; }
		}
		return diff;
	}
	
	
	public int userCompare(String aName, int aId, String bName, int bId){
		if (aName.compareTo(bName) < 0)         { return -1; }
		else if (aName.compareTo(bName) > 0)    { return  1; }
		else { // same name
			if (aId < bId)                      { return -1; }
			else if (aId > bId)                 { return  1; }
			else                                { return  0; }
		}
	}
	
	
	public String[] mergeTwo(String[] a, String[] b, int n) {
	    String[] c = new String[n];
		int aIdx = 0;
		int bIdx = 0;
		int cIdx = 0;
		while (cIdx < n) {
	        if (aIdx >= a.length) {
				c[cIdx++] = b[bIdx++];
	        }
	        else if (bIdx >= b.length) {
	            c[cIdx++] = a[aIdx++];
	        }
			else if (a[aIdx].compareTo(b[bIdx]) < 0) {
		    	c[cIdx++] = a[aIdx++];
		    }
		    else if (a[aIdx].compareTo(b[bIdx]) == 0) {
		    	if (aIdx > bIdx) { bIdx++; } 
	          	else { aIdx++; }
		   	}
		    else {
		      c[cIdx++] = b[bIdx++];
		    }
	    }
		return c;
	}
	
	
	public int commonTwo(String[] a, String[] b) {
		int aIdx = 0;
	    int bIdx = 0;
	    int ct = 0;
	    String lastCounted = "";
	    while (aIdx < a.length && bIdx < b.length) {
			if (a[aIdx].compareTo(b[bIdx]) == 0) {
	            if (!a[aIdx].equals(lastCounted)) {
					lastCounted = a[aIdx];
	                ct++;
	            }
	            aIdx++;
	        	bIdx++;
	        }
	        else if (a[aIdx].compareTo(b[bIdx]) < 0) {
				aIdx++;
	        }
	        else {
	            bIdx++;
	        }
	    }
	    return ct;
	}


}
