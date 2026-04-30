import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums); // Step 1: sort

        int c = 1; // current count
        int l = 1; // longest

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            }

            if (nums[i] == nums[i - 1] + 1) {
                c++; // consecutive
            } else {
                c = 1; // reset
            }

            l = Math.max(l, c);
        }

        return l;
    }
}