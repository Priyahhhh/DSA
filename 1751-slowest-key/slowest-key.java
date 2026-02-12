class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        int maxDuration = releaseTimes[0];
        char result = keysPressed.charAt(0);
        
        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            char currentChar = keysPressed.charAt(i);
            
            if (duration > maxDuration) {
                maxDuration = duration;
                result = currentChar;
            } 
            else if (duration == maxDuration) {
                if (currentChar > result) {  // lexicographically larger
                    result = currentChar;
                }
            }
        }
        
        return result;
    }
}
