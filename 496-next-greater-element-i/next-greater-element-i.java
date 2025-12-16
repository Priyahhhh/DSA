class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int found = 0;   // to track nums1[i] position
            ans[i] = -1;    // default answer

            for (int j = 0; j < nums2.length; j++) {

                if (nums2[j] == nums1[i]) {
                    found = 1;
                }

                if (found == 1 && nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }

        return ans;
    }
}
