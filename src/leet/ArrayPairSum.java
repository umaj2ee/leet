package leet;

import java.util.Arrays;

public class ArrayPairSum {

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		int[] minval = new int[nums.length / 2];
		int index = 0;
		if (nums[0] > -10000 && nums[nums.length - 1] < 100000) {
			for (int i = 0; i < nums.length; i++) {
				int a = nums[i];
				int b = nums[i + 1];// System.out.println(a+">"+b);
				if (a > b)
					minval[index++] = b;
				else
					minval[index++] = a;
				i = i + 1;
			}

			for (int i = 0; i < minval.length; i++) {
				sum = sum + minval[i];
				System.out.println(sum);
			}
		}
		return sum;
	}

}
