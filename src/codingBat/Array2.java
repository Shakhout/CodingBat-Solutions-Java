package codingBat;

/**
 * Array-2 Section ("Medium array problems -- 1 loop")
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class Array2 {
	
	public int countEvens(int[] nums) {
		int evens = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evens++;
			}
		}
		return evens;
	}
	
	
	public int bigDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) { min = nums[i]; }
			if (nums[i] > max) { max = nums[i]; }
		}
		return Math.abs(max - min);
	}
	
	
	public int centeredAverage(int[] nums) {
		// get min & max
		int min = nums[0];
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) { min = nums[i]; }
			if (nums[i] > max) { max = nums[i]; }
		}
		
		// calculate avg
		int sum = 0;
		int cAvg;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		// ignore min and max
		sum = sum - min - max; 
		cAvg = sum / (nums.length - 2);
		return cAvg;
	}
	
	
	public int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				++i; // skips number after 13 as well
				continue;
			}
			sum += nums[i];
		}
		return sum;
	}
	
	
	public int sum67(int[] nums) {
		int sum = 0;
		boolean inSpan = false;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				inSpan = true;
			}
			else if (nums[i] == 7 && inSpan) {
				inSpan = false;
			}
			else if (!inSpan) {
				sum += nums[i];
			}
		}
		return sum;
	}
	
	
	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length && nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean lucky13(int[] nums) {
		boolean no1s = true;
		boolean no3s = true;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				no1s = false;
			}
			if (nums[i] == 3) {
				no3s = false;
			}
		}
		return no1s && no3s;
	}
	
	
	public boolean sum28(int[] nums) {
		int sum2s = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) { sum2s += 2; }
		}
		return (sum2s == 8);
	}
	
	
	public boolean more14(int[] nums) {
		int num1s = 0;
		int num4s = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) { num1s++; } 
			if (nums[i] == 4) { num4s++; }
		}
		return (num1s > num4s);
	}
	
	
	public int[] fizzArray(int n) {
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
		return array;
	}
	
	
	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				return false;
			}
		}
		return true;
	}
	
	
	public String[] fizzArray2(int n) {
		String sAr[] = new String[n];
		for (int i = 0; i < n; i++) {
			sAr[i] = String.valueOf(i);
		}
		return sAr;
	}
	
	
	public boolean no14(int[] nums) {
		boolean found1 = false;
		boolean found4 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) { found1 = true; }
			if (nums[i] == 4) { found4 = true; }
		}
		return !found1 || !found4;
	}
	
	
	public boolean isEverywhere(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val ) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean either24(int[] nums) {
		boolean cons2 = false;
		boolean cons4 = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) { cons2 = true; }
			if (nums[i] == 4 && nums[i + 1] == 4) { cons4 = true; }
		}
		return (cons2 && !cons4) || (cons4 && !cons2);
	}
	
	
	public int matchUp(int[] nums1, int[] nums2) {
		int ct = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
				ct++;
			}
		}
		return ct;
	}
	
	
	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if ( i + 1 < nums.length && nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			}
			if (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean has12(int[] nums) {
		boolean one = false;
		for (int i = 0; i < nums.length; i++) {
			if (!one && nums[i] == 1) {
				one = true;
			}
			if (one && nums[i] == 2) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
				return true;
			}
			if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean haveThree(int[] nums) {
		int threes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				threes++;
				if (i + 1 < nums.length && nums[i + 1] == 3) {
					return false;
				}
			}
		}
		return threes == 3;
	}
	
	
	public boolean twoTwo(int[] nums) {
		boolean paired = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				if (i - 1 >= 0 && nums[i - 1] == 2) {
					paired = true;
				}
				else if (i + 1 < nums.length && nums[i + 1] == 2) {
					paired = true;
				}
				else {
					paired = false;
				}
			}
		}
		return paired;
	}
	
	
	public boolean sameEnds(int[] nums, int len) {
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[nums.length - len + i]) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean tripleUp(int[] nums) {
		  for (int i = 0; i < nums.length - 2; i++) {
		    if (nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2]) {
		      return true;
		    }
		  }
		  return false;
		}

	
	public int[] fizzArray3(int start, int end) {
		int[] fizz = new int[end - start];
	    for (int i = 0; i < end - start; i++) {
	        fizz[i] = i + start;
	    }
	    return fizz;
	}

	
	public int[] shiftLeft(int[] nums) {
		int[] left = new int[nums.length];
	    for (int i = 0; i <= nums.length - 2; i++) {
			left[i] = nums[i + 1];
	    }
	    if (nums.length > 0) { left[nums.length - 1] = nums[0]; }
	    return left;
	}

	
	public int[] tenRun(int[] nums) {
	    int currentM = -1;
	    boolean mult = false;
	    for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				currentM = nums[i];
	            mult = true;
	            continue;
	        }
	        if (mult) {
	            nums[i] = currentM;
	        }
	    }
	    return nums;
	}
	
	
	public int[] pre4(int[] nums) {
		int aSz = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] != 4) { aSz++; }
	        else { break; }
	    }
	    int[] A = new int[aSz];
	    for (int i = 0; i < aSz; i++) {
			A[i] = nums[i];
	    }
	    return A;
	}

	
	public int[] post4(int[] nums) {
	  	int lastFourIdx = -1;
	    for (int i = nums.length - 1; i >= 0; i--) {
	        if (nums[i] == 4) { 
	            lastFourIdx = i; 
	            break;
	        }
	    }
	    int aLen = nums.length - 1 - lastFourIdx;
	    int[] A = new int[aLen];
	    for (int j = 0; j < aLen; j++) {
			A[j] = nums[j + lastFourIdx + 1];
	    }
	    return A;
	}
	
	
	public int[] notAlone(int[] nums, int val) {
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] == val) {
		        if (i - 1 >= 0 && i + 1 < nums.length) {
	    	        if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
	        	    	nums[i] = (nums[i - 1] > nums[i + 1]) ? nums[i - 1] : nums[i + 1];
		            }
		        }
		    }
	    }
	    return nums;
	}

	
	public int[] zeroFront(int[] nums) {
		int zeros = 0;
	    for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) { zeros++; }
	    }
	    int[] A = new int[nums.length];
	    int AIdx = zeros;
	    for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				A[AIdx++] = nums[i]; 
	        }
	    }
	    return A;
	}


	public int[] withoutTen(int[] nums) {
		int[] A = new int[nums.length];
	    int tens = 0;
	    for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) { tens++; }
	        else { A[i - tens] = nums[i]; }
	    }
	    return A;
	}


	public int[] zeroMax(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
	            int bigOdd = largestOddR(nums, i);
	            nums[i] = bigOdd >= 1 ? bigOdd : 0;
	        }
	    }
	    return nums;
	}
	/** Helper method for zeroMax */
	public int largestOddR(int[] nums, int stIdx) {
		int bigOdd = -1;
	    for (int i = stIdx; i < nums.length; i++) {
			if (nums[i] % 2 == 1 && nums[i] >= bigOdd) { 
	            bigOdd = nums[i]; 
	        }
	    }
	    return bigOdd;
	}

	
	public int[] evenOdd(int[] nums) {
		int numEvens = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				swap(nums, i, numEvens);
	            numEvens++;
	        }
	    }
	    return nums;
	}
	/** Swap method used in evenOdd solution */
	public void swap(int[] A, int idx1, int idx2) {
	    int temp = A[idx1];
	    A[idx1] = A[idx2];
	    A[idx2] = temp;
	}
	
	
	public String[] fizzBuzz(int start, int end) {
		String[] str = new String[end - start];
	    for (int i = start; i < end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				str[i - start] = "FizzBuzz";
	        }
	        else if (i % 3 == 0) {
	            str[i - start] = "Fizz";
	        }
	        else if (i % 5 == 0) {
	            str[i - start] = "Buzz";
	        }
	        else {
	            str[i - start] = String.valueOf(i);
	        }
	    }
	    return str;
	}

}
