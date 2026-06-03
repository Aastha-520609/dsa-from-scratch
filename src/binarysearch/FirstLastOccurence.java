package binarysearch;

import java.util.Arrays;

public class FirstLastOccurence {

    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);

        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

    public int lowerBound(int[] nums, int target) {
        int ans = nums.length;
        int low = 0;
        int high = ans - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int upperBound(int[] nums, int target) {
        int ans = nums.length;
        int low = 0;
        int high = ans - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        FirstLastOccurence obj = new FirstLastOccurence();

        // Example 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        System.out.println(
                "Output: " +
                Arrays.toString(obj.searchRange(nums1, target1))
        );

        // Example 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        System.out.println(
                "Output: " +
                Arrays.toString(obj.searchRange(nums2, target2))
        );

        // Example 3
        int[] nums3 = {};
        int target3 = 0;
        System.out.println(
                "Output: " +
                Arrays.toString(obj.searchRange(nums3, target3))
        );

        // Additional Example
        int[] nums4 = {2, 2, 2, 2, 2};
        int target4 = 2;
        System.out.println(
                "Output: " +
                Arrays.toString(obj.searchRange(nums4, target4))
        );
    }
}