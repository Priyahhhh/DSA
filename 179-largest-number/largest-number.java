class Solution {
    public String largestNumber(int[] nums) {

        String[] s = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            s[i] = nums[i] + "";
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {

                String x = s[i] + s[j];
                String y = s[j] + s[i];

                if (y.compareTo(x) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        if (s[0].equals("0")) {
            return "0";
        }

        String result = "";
        for (int i = 0; i < s.length; i++) {
            result = result + s[i];
        }

        return result;
    }
}
