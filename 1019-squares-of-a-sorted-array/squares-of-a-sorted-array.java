import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        // Square each element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i]; // squaring automatically makes it positive
        }

        // Sort the array
        Arrays.sort(nums);

        return nums; // return inside the method
    }
}
