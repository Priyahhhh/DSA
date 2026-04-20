class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0; // current streak of 1s
        int max = 0;   // maximum streak

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;            // increase streak
                if (count > max) {
                    max = count;    // update max
                }
            } else {
                count = 0;          // reset when 0 comes
            }
        }

        return max;
    }
}