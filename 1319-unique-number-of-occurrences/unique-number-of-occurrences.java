import java.util.Arrays;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int[] freq = new int[n];
        int index = 0;
        int count = 1;

        // Count frequencies
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                freq[index++] = count;
                count = 1;
            }
        }
        freq[index++] = count;

        // Sort frequency array
        Arrays.sort(freq, 0, index);

        // Check uniqueness
        for (int i = 1; i < index; i++) {
            if (freq[i] == freq[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
