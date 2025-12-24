class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] <= target) {             // Move right if mid letter is not greater than target
                low = mid + 1;
            } else {
                // Possible answer, move left to find smaller greater letter
                high = mid - 1;
            }
        }
        // If low goes out of bounds, wrap around to first element
        return letters[low % letters.length];
    }
}
