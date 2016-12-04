package solutions;

/**
 * 245. Shortest Word Distance III
 *
 * This is a follow up of Shortest Word Distance. The only difference is now
 * word1 could be the same as word2.
 *
 * Given a list of words and two words word1 and word2, return the shortest
 * distance between these two words in the list.
 *
 * word1 and word2 may be the same and they represent two individual words in
 * the list.
 *
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 *
 * Given word1 = “makes”, word2 = “coding”, return 1.
 * Given word1 = "makes", word2 = "makes", return 3.
 *
 * Note:
 * You may assume word1 and word2 are both in the list.
 */

public class Solution245 {
    public int shortestWordDistance(String[] words, String w1, String w2) {
        if (w1.equals(w2))
            return shortestSameWord(words, w1);
        else
            return shortestDiffWord(words, w1, w2);
    }

    public int shortestDiffWord(String[] words, String word1, String word2) {
        Integer last1 = null, last2 = null, minDist = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                if (last2 != null)
                    minDist = Math.min(minDist, Math.abs(last2 - i));
                last1 = i;
            } else if (words[i].equals(word2)) {
                if (last1 != null)
                    minDist = Math.min(minDist, Math.abs(last1 - i));
                last2 = i;
            }
        }
        return minDist;
    }

    public int shortestSameWord(String[] words, String word) {
        Integer last1 = null, last2 = null, minDist = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(word))
                continue;
            else if (last1 == null)
                last1 = i;
            else {
                last2 = last1;
                last1 = i;
                minDist = Math.min(minDist, last1 - last2);
            }
        }
        return minDist;
    }
}