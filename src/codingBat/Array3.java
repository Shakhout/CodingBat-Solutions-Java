package codingBat;


/**
 * Array-3 Section ("Harder array problems -- 2 loops, more complex logic")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class Array3 {
	
	public int maxSpan(int[] nums) {
		int maxSpan = 0;
	    for (int i = 0; i < nums.length; i++) {
			int currentSpan = 1;
	        for (int j = nums.length - 1; j > i; j--) {
				if (nums[j] == nums[i]) {
					currentSpan = j - i + 1; // # of elements b/t them *inclusive*
	                break;
	            }
	        }
	        if (currentSpan > maxSpan) { maxSpan = currentSpan; }
	    }
	    return maxSpan;
	}

	
	public int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 3 && nums[i + 1] != 4) {
	            int fourIndex = findNextFour(nums, i);
	            if (fourIndex != -1) {
	                swap(nums, i + 1, fourIndex);
	            }
	            else {
	                swap(nums, i + 1, findPrevFour(nums, i));
	            }
	        }
	    }
	    return nums;
	}
	/** Return the index of the closest 4 located after startIndex, or -1 if not found */
	public int findNextFour(int[] nums, int startIndex) {
	    for (int i = startIndex + 1; i < nums.length; i++) {
	        if (nums[i] == 4) { return i; }
	    }
	    return -1;
	}
	/** Return the index of the closest 4 located before startIndex, or -1 if not found */
	public int findPrevFour(int[] nums, int startIndex) {
	    for (int i = startIndex - 1; i >= 0; i--) {
	        if (nums[i] == 4) { return i; }
	    }
	    return -1;
	}
	/** Swaps two int elements */
	public void swap(int[] nums, int idx1, int idx2) {
	    int temp = nums[idx1];
	    nums[idx1] = nums[idx2];
	    nums[idx2] = temp;
	}

	
	public int[] fix45(int[] nums) {
	    int j = 0;
	    for (int i = 0; i < nums.length - 1; ++i) {
	    	if (nums[i] == 4 && nums[i + 1] != 5) {
	        	while (nums[j] != 5 || (j != 0 && nums[j - 1] == 4)) {
	            	j++;
	          	}
	          	nums[j] = nums[i + 1];
	          	nums[i + 1] = 5;
	        }
	  	}
	    return nums;
	}
	
	
	public boolean canBalance(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (arraySum(nums, 0, i) == arraySum(nums, i + 1, nums.length - 1)) {
	            return true;
	        }
	    }
	    return false;
	}
	/** Sum a portion of an int array from [start, end] */
	public int arraySum(int[] nums, int startIdx, int endIdx) {
		int sum = 0;
	    for (int i = startIdx; i <= endIdx; i++) {
	        sum += nums[i];
	    }
	    return sum;
	}

	
	public boolean linearIn(int[] outer, int[] inner) {
		int i = 0;
	    int j = 0;
	    while (i < inner.length) {
			if (j == outer.length) { return false; }
			else if (inner[i] > outer[j]) {
				j++;
	        }
	        else if (inner[i] == outer[j]) {
	            i++;
	            j++;
	        }
	        else {
	            return false;
	        }
	    }
	    return true;
	}


	public int[] squareUp(int n) {
	    int[] A = new int[n * n];
	    int shifts = 0;
	    for (int i = A.length - 1; i >= 0; i -= n) {
	        int val = n - shifts; 
			for (int j = i - n + 1 + shifts; j <= i; j++) {
				A[j] = val--;
	        }
	        shifts++;
	    }
		return A;
	}

	
	public int[] seriesUp(int n) {
	    int[] A = new int[ (n*(n+1)) / 2];
	    int currentMax = 1;
	    int currentVal = 1;
	    for (int i = 0; i < A.length; i++) {
			if (currentVal > currentMax) {
				currentVal = 1;
	            ++currentMax;
	        }
	        A[i] = currentVal++;
	    }
	    return A;
	}


//	public int maxMirror(int[] nums) {
//		// TODO
//	}

	
}
