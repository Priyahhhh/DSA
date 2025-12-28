class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (list.contains(nums1[i])) {
                result.add(nums1[i]);
                list.remove(Integer.valueOf(nums1[i])); 
            }
        }
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}