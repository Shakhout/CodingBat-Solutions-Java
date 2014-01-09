

/**
 * Array-1 Section Problems See CodingBat.com for prompts
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */

public class Array1 {
	
	
	public boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}
	
	
	public boolean sameFirstLast(int[] nums) {
		return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
	}
	
	
	public int[] makePi() {
		int[] pi = {3, 1, 4};
		return pi;
	}
	
	
	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
	}
	
	
	public int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	
	/** Shift array elements left one index - in-place (less space used) */
	public int[] rotateLeft3(int[] nums) {
		// save 0th element
		int temp = nums[0];
		
		for (int i = 0; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}
		nums[nums.length - 1] = temp;
		return nums;
	}
	
	
	/** Shift array elements left one index - new array version */
	public int[] rotateLeft3_newArray(int[] nums) {
		int[] result = new int[nums.length];
		result[result.length - 1] = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			result[i] = nums[i + 1];
		}
		return result;
	}
	
	
	/** Reverse an array - with a new array */
	public int[] reverse3(int[] nums) {
		int[] newA = new int[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) {
			newA[nums.length - 1 - i] = nums[i];
		}
		return newA;
	}
	
	
	/** Reverse an array - in-place */
	public int[] reverse3inPlace(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			// swap
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
			
			i++;
			j--;
		}
		return nums;
	}
	
	
	public int[] maxEnd3(int[] nums) {
		if (nums[0] >= nums[2]) {
			nums[1] = nums[0];
			nums[2] = nums[0];
		} 
		else {
			nums[0] = nums[2];
			nums[1] = nums[2];
		}
		return nums;
	}
	
	
	public int sum2(int[] nums) {
		int sum = 0;
		for (int i = 0; i < 2 && i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	
	public int[] middleWay(int[] a, int[] b) {
		int[] c = {a[1], b[1]};
		return c;
	}
	
	
	public int[] makeEnds(int[] nums) {
		int[] ray = { nums[0], nums[nums.length-1] };
		return ray;
	}
	
	
	public boolean has23(int[] nums) {
		return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
	}
	
	
	public boolean no23(int[] nums) {
		return nums[0] !=2 && nums[0] !=3 && nums[1] !=2 && nums[1] != 3;
	}
	
	
	public int[] makeLast(int[] nums) {
		int[] nums2 = new int[nums.length * 2];
		nums2[nums2.length - 1] = nums[nums.length - 1];
		return nums2;
	}
	
	
	public boolean double23(int[] nums) {
		if (nums.length < 2) {
			return false;
		} 
		else {
			return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
		}
	}
	
	
	public int[] fix23(int[] nums) {
		for (int i = 0; i <= 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 3)  {
				nums[i + 1] = 0;
				return nums;
			}
		}
		return nums;
	}
	
	
	public int start1(int[] a, int[] b) {
		int total = 0;
		if (a.length > 0 && a[0] == 1) {
			total++;
		}
		if (b.length > 0 && b[0] == 1) {
			total++;
		}
		return total;
	}
	
	
	public int[] biggerTwo(int[] a, int[] b) {
		if ( (b[0] + b[1]) > (a[0] + a[1]) ) { return b;} 
		else { return a; }
	}
	
	
	public int[] makeMiddle(int[] nums) {
		if (nums.length == 2) {
			return nums;
		} 
		else {
			int side = (nums.length - 2)/2;
			int[] newA = new int[2];
			newA[0] = nums[side];
			newA[1] = nums[nums.length - 1 - side];
			return newA;
		}
	}
	
	
	public int[] plusTwo(int[] a, int[] b) {
		int[] result = {a[0], a[1], b[0], b[1]};
		return result;
	}
	
	
	public int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}
	
	
	public int[] midThree(int[] nums) {
		int trim = (nums.length - 3) / 2;
		int[] a = new int[3];
		a[0] = nums[trim];
		a[1] = nums[trim + 1];
		a[2] = nums[trim + 2];
		return a;
	}
	
	
	public int maxTriple(int[] nums) {
		int midIdx = nums.length / 2; // integer division rounds down - 5/2 = 2
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums[0] >= nums[midIdx] && nums[0] >= nums[nums.length - 1]) {
			return nums[0];
		}
		else if (nums[midIdx] >= nums[0] && nums[midIdx] >= nums[nums.length - 1]) {
			return nums[midIdx];
		}
		else {
			return nums[nums.length - 1];
		}
	}
	
	
	public int[] frontPiece(int[] nums) {
		if (nums.length > 2) {
			int[] two = {nums[0], nums[1]};
			return two;
		}
		return nums;
	}
	
	
	public boolean unlucky1(int[] nums) {
		if (nums.length < 2) { return false; } 
		else if (nums.length == 2) { 
			return (nums[0] == 1 && nums[1] == 3);
		}
		return (nums[0] == 1 && nums[1] == 3) || 
				(nums[1] == 1 && nums[2] == 3) || 
				(nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
	}
	
	
	public int[] make2(int[] a, int[] b) {
		int[] c = new int[2];
		if (a.length == 0) {
			c[0] = b[0];
			c[1] = b[1];
		} 
		else if (a.length == 1) {
			c[0] = a[0];
			c[1] = b[0];
		} 
		else { // (a.length >= 2)
			c[0] = a[0];
			c[1] = a[1];
		} 
		return c;
	}
	
	
	public int[] front11(int[] a, int[] b) {
		if (a.length > 0 && b.length > 0) {
			int[] c = { a[0], b[0] };
			return c;
		}
		else if (a.length > 0) {
			int[] c = { a[0] };
			return c;
		}
		else if (b.length > 0) {
			int[] c = { b[0] };
			return c;
		}
		else {
			int[] c = {};
			return c;
		}
	}
	
	
}
