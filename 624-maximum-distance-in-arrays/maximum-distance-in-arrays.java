import java.util.List;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // Initialize with first array
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        int maxDistance = 0;

        // Start from second array
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);

            int currMin = curr.get(0);
            int currMax = curr.get(curr.size() - 1);

            // Calculate possible distances
            maxDistance = Math.max(maxDistance, Math.abs(currMax - minVal));
            maxDistance = Math.max(maxDistance, Math.abs(maxVal - currMin));

            // Update global min and max
            minVal = Math.min(minVal, currMin);
            maxVal = Math.max(maxVal, currMax);
        }

        return maxDistance;
    }
}
