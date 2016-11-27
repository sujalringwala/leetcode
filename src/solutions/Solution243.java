package solutions;

public class Solution243 {
    public int shortestDistance(String[] words, String word1, String word2) {

        Integer lastSeen1 = null;
        Integer lastSeen2 = null;
        Integer minDist = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                if (lastSeen2 != null)
                    minDist = Math.min(minDist, Math.abs(lastSeen2 - i));
                lastSeen1 = i;
            } else if (words[i].equals(word2)) {
                if (lastSeen1 != null)
                    minDist = Math.min(minDist, Math.abs(lastSeen1 - i));
                lastSeen2 = i;
            }
        }
        return minDist;
    }
}
