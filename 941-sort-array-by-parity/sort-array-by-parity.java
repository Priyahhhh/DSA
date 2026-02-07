class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int n = nums.length;
        int[] result = new int[n];
        int evenIndex = 0;       // start from beginning
        int oddIndex = n - 1;    // start from end

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;   // place even number at start
                evenIndex++;
            } else {
                result[oddIndex] = num;    // place odd number at end
                oddIndex--;
            }
        }
        return result;
        
    }
}