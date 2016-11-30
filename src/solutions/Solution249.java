package solutions;

import java.util.*;

/**
 * 249. Group Shifted Strings
 *
 * Given a string, we can "shift" each of its letter to its successive letter,
 * for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:
 *
 * "abc" -> "bcd" -> ... -> "xyz"
 *
 * Given a list of strings which contains only lowercase alphabets, group all
 * strings that belong to the same shifting sequence.
 *
 * For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
 * A solution is:
 */

public class Solution249 {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strings) {
            String tag = getTag(s);
            if (!map.containsKey(tag))
                map.put(tag, new ArrayList<>());
            map.get(tag).add(s);
        }
        for (List<String> list: map.values())
            Collections.sort(list);
        return new ArrayList<>(map.values());
    }

    public String getTag(String s) {
        int offset = s.charAt(0) - 'a';
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray())
            sb.append((c + 26 - offset) % 26);
        return sb.toString();
    }
}
