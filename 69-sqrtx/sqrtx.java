class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) return x;

        int low = 0;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long)mid * mid <= x) { // use long to avoid overflow
                ans = mid;      // mid is a candidate
                low = mid + 1;  // try larger
            } else {
                high = mid - 1; // mid*mid > x, try smaller
            }
        }

        return ans;
    }

}