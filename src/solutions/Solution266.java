package solutions;

import java.util.HashSet;
import java.util.Set;

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