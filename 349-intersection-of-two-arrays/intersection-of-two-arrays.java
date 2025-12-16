class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length];
        int size = 0;

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    int flag = 0;
                    for (int k = 0; k < size; k++) {
                        if (temp[k] == nums1[i]) {
                            flag = 1;
                        }
                    }

                    if (flag == 0) {
                        temp[size] = nums1[i];
                        size++;
                    }
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
