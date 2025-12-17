class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // last character is the position number
            int pos = word.charAt(word.length() - 1) - '1';

            // store word without number
            result[pos] = word.substring(0, word.length() - 1);
        }

        String ans = "";
        for (int i = 0; i < result.length; i++) {
            ans += result[i];
            if (i < result.length - 1) {
                ans += " ";
            }
        }

        return ans;
    }
}
