import java.util.Random;

class Solution {

    int[] original;
    int[] array;
    Random rand;

    public Solution(int[] nums) {
        original = nums.clone();   // store original
        array = nums.clone();      // working array
        rand = new Random();
    }

    // Reset to original configuration
    public int[] reset() {
        array = original.clone();
        return array;
    }

    // Shuffle using Fisher-Yates
    public int[] shuffle() {

        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // random index [0, i]

            // swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }
}
