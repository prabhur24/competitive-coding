package analysis;

public class LinearGrowth {


	public static void main(String[] args) {

		//quadratic();
		//binarySearch();
		logNum();

	}

	private static void logNum() {
		for (int i = 0; i < 100; i++) {
			System.out.println("log(%d) = %f".formatted(i, Math.log(i)));
		}
	}

	private static void binarySearch() {

		int nums[] = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

		System.out.println("4 :: " + binaryAlgo(nums, 4));
		System.out.println("8 :: " + binaryAlgo(nums, 8));
		System.out.println("12 :: " + binaryAlgo(nums, 12));
		System.out.println("3 :: " + binaryAlgo(nums, 3));
		System.out.println("15 :: " + binaryAlgo(nums, 15));
		System.out.println("-1 :: " + binaryAlgo(nums, -1));


	}

	public static int binaryAlgo(int nums[], int target) {
		int low = 0;
		int high = nums.length;
		int loopCount = 0;

		while (low <= high) {
			loopCount++;

			int mid = (low + high) / 2;

			if (nums[mid] == target) {
				//return mid;
				return loopCount;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else if (nums[mid] > target) {
				high = mid - 1;
			}
		}
		return loopCount;
	}

	private static void quadratic() {
		int n = 5;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum++;
			}
		}

		System.out.println("First Loop : %d".formatted(sum));
		sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				sum++;
			}
		}
		System.out.println("Second loop .. : %d".formatted(sum));
	}

}
