package leetcode;


import java.util.Scanner;

/**
 * @probelm_statement :  Given 32-bit integer x, return with its digit reversed
 * 1. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0
 */
public class Easy_ReverseInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while (testCase-- > 0) {
			int x = scanner.nextInt();
			long powerOf2 = Double.valueOf(Math.pow(2, 31)).longValue();
			System.out.println(powerOf2);
			System.out.println(reverse(x));
		}

	}

	private static int reverse(int x) {
		Long mod = 0L;
		while (x != 0) {
			mod = (mod * 10) + (x % 10);
			x /= 10;
		}
		//1534236469
		//-2147483648
		//System.out.println(mod);
		// constraint
		if (mod > Math.pow(2, 31) - 1 || mod < Math.pow(-2, 31)) {
			return 0;
		}
		return mod.intValue();
	}
}
