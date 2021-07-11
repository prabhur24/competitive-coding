package leetcode;


import java.util.Arrays;

/**
 * @probelm_statement Given an integer array nums of length n, you want to create an array ans of length 2n <br>
 * where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 */
public class Easy_ConcatenationOfArray {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}

	private static int[] getConcatenation(int[] nums) {
		int n = nums.length * 2;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = nums[i % nums.length];
		}
		return ans;
	}
}
