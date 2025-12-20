class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;
        int n = nums.length;

        // Check each bit position
        for (int i = 0; i < 32; i++) {
            int count = 0;

            // Count set bits at position i
            for (int j = 0; j < n; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    count++;
                }
            }

            // If count is not divisible by 3, set the bit
            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
