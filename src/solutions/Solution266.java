package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 266. Palindrome Permutation
 *
 * Given a string, determine if a permutation of the string could form a
 * palindrome.
 *
 * For example,
 * "code" -> False, "aab" -> True, "carerac" -> True.
 */

public class Solution266 {
    public boolean canPermutePalindrome(String s) {
        Set<Character> characters = new HashSet<>();

        for (Character character: s.toCharArray()) {
            if (characters.contains(character))
                characters.remove(character);
            else
                characters.add(character);
        }
        return characters.size() < 2;
    }
}