package codingBat;


/**
 * Recursion-2 Section ("Harder recursion problems" - most involve backtracking)
 * See CodingBat.com for prompts.
 * @author Navid Rojiani
 * @version Jan 8, 2014
 */
public class Recursion2 {

    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) { return target == 0; }
        return groupSum(start + 1, nums, target - nums[start]) ||
               groupSum(start + 1, nums, target);
    }


    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) { return target == 0; }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }
        else {
            return groupSum6(start + 1, nums, target - nums[start]) ||
                   groupSum6(start + 1, nums, target);
        }
    }


    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) { return target == 0; }
        return groupNoAdj(start + 2, nums, target - nums[start]) ||
               groupNoAdj(start + 1, nums, target);
    }


    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) { return target == 0; }
        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            }
            else {
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }
        else {
            return groupSum5(start + 1, nums, target - nums[start]) ||
                   groupSum5(start + 1, nums, target);
        }

    }


    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) { return target == 0; }
        int n = consecutives(nums, start);
        // choose consecutive || don't choose clump
        return groupSumClump(start + n, nums, target - (n * nums[start])) ||
               groupSumClump(start + n, nums, target);
    }
    /**
     * Helper method for groupSumClump. Gives the length of a series of
     * consecutive numbers in an array starting at 'startIndex'
     */
    public int consecutives(int[] nums, int startIndex) {
        int numConsec = 1;
        for (int i = startIndex; i + 1 < nums.length; i++) {
            if (nums[i + 1] == nums[i]) { numConsec++; }
            else { break; }
        }
        return numConsec;
    }


    public boolean splitArray(int[] nums) {
        return balance(nums, 0, 0, 0);
    }
    /** Helper method for splitArray */
    private boolean balance(int[] nums, int start, int sum1, int sum2) {
        if (start >= nums.length) { return sum1 == sum2; }
        // add next index element either to sum1 or sum2
        return balance(nums, start + 1, sum1 + nums[start], sum2) ||
               balance(nums, start + 1, sum1, sum2 + nums[start]);
    }


    public boolean splitOdd10(int[] nums) {
        return balance10Odd(nums, 0, 0, 0);
    }
    /** Helper method for splitOdd10 */
    private boolean balance10Odd(int[] nums, int start, int sum1, int sum2) {
        if (start >= nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1);
        }
        else {
            return balance10Odd(nums, start + 1, sum1 + nums[start], sum2) ||
                   balance10Odd(nums, start + 1, sum1, sum2 + nums[start]);
        }
    }


    public boolean split53(int[] nums) {
        return balance3and5(nums, 0, 0, 0);
    }
    /** Helper method for split53 */
    private boolean balance3and5(int[] nums, int start, int sum3s, int sum5s) {
        if (start >= nums.length) { return sum3s == sum5s; }
        else if (nums[start] % 5 == 0) {
            return balance3and5(nums, start + 1, sum3s, sum5s + nums[start]);
        }
        else if (nums[start] % 3 == 0 && nums[start] % 5 != 0) {
            return balance3and5(nums, start + 1, sum3s + nums[start], sum5s);
        }
        else {
            return balance3and5(nums, start + 1, sum3s + nums[start], sum5s) ||
                   balance3and5(nums, start + 1, sum3s, sum5s + nums[start]);
        }
    }
}
