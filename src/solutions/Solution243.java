package solutions;

/**
 * 243. Shortest Word Distance
 *
 * Given a list of words and two words word1 and word2, return the shortest
 * distance between these two words in the list.
 *
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 *
 * Given word1 = “coding”, word2 = “practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 *
 * Note:
 * You may assume that word1 does not equal to word2, and word1 and word2 are
 * both in the list.
 */

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
