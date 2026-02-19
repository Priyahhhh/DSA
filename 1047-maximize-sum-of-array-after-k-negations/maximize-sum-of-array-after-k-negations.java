import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        
        Arrays.sort(nums);   // Step 1: sort
        
        // Step 2: Flip negative numbers first
        for(int i = 0; i < nums.length && k > 0; i++) {
            if(nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        
        Arrays.sort(nums);  // Step 3: re-sort to get smallest element
        
        // Step 4: If k is still odd, flip smallest element
        if(k % 2 == 1) {
            nums[0] = -nums[0];
        }
        
        // Step 5: Calculate sum
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        
        return sum;
    }
}
