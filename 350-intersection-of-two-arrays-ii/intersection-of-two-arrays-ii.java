class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length];
        int size = 0;

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    temp[size] = nums1[i];
                    size++;

                    nums2[j] = -1; // mark used
                    break;
                }
            }
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
