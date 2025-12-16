class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] answer = new String[n];

        // Make a copy of score array
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = score[i];
        }

        // Sort temp array in descending order (basic sorting)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temp[i] < temp[j]) {
                    int swap = temp[i];
                    temp[i] = temp[j];
                    temp[j] = swap;
                }
            }
        }

        // Assign ranks
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (score[i] == temp[j]) {

                    if (j == 0)
                        answer[i] = "Gold Medal";
                    else if (j == 1)
                        answer[i] = "Silver Medal";
                    else if (j == 2)
                        answer[i] = "Bronze Medal";
                    else
                        answer[i] = String.valueOf(j + 1);

                    break;
                }
            }
        }

        return answer;
    }
}
