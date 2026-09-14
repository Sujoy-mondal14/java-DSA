package com.Leet_code_daily;

import java.util.Scanner;

public class StableArray {
        public static int firstStableIndex(int[] nums, int k) {
            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;

            int minIdx = 101;

            for (int i = 0; i < nums.length; i++) {
                maxValue = Math.max(maxValue, nums[i]);
                for (int j = nums.length - 1; j >= i; j--) {
                    minValue = Math.min(minValue, nums[j]);
                }

                int diff = maxValue - minValue;

                if (diff <= k) minIdx = Math.min(minIdx, i);
            }

            if (minIdx == 101) return -1;
            return minIdx;
        }

    static void main() {
        int[] nums = {5,0,1,4};
        int k = 3;
        int ans = firstStableIndex(nums, k);
        System.out.println(ans);
    }
}
