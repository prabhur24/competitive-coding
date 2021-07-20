package leetcode;


import java.util.Arrays;

/**
 * @probelm_statement Given an integer array nums of length n, you want to create an array ans of length 2n <br>
 * where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 */
public class Easy_ConcatenationOfArray {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 5, 1, 5, 3, 3, 4};
		System.out.println(Math.ceil(3.65));
		System.out.println(Math.ceil(3.35));
		System.out.println(Math.ceil(3.34));


		System.out.println(Math.floor(3.65));
		System.out.println(Math.floor(3.35));
		System.out.println(Math.floor(3.34));
		//System.out.println(oddNumber(nums));
		//System.out.println(Arrays.toString(getConcatenation(nums)));
	}

	private static int oddNumber(int[] nums) {
		int num = 0;
		int size = nums.length;
		for (int i = 0; i < size; i++) {
			num ^= nums[i];
		}
		return num;
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
