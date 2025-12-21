class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int left = 0, right = nums.length - 1;

        // Find first position
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) right = mid - 1;
            else left = mid + 1;
            if (nums[mid] == target) start = mid;
        }

        left = 0;
        right = nums.length - 1;

        // Find last position
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) left = mid + 1;
            else right = mid - 1;
            if (nums[mid] == target) end = mid;
        }

        return new int[]{start, end};
    }
}
