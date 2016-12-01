package solutions;

/**
 * 408. Valid Word Abbreviation
 *
 * Given a non-empty string s and an abbreviation abbr, return whether the
 * string matches with the given abbreviation.
 *
 * A string such as "word" contains only the following valid abbreviations:
 *
 * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d",
 * "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
 *
 * Notice that only the above abbreviations are valid abbreviations of the
 * string "word". Any other string is not a valid abbreviation of "word".
 *
 * Note:
 * Assume s contains only lowercase letters and abbr contains only lowercase
 * letters and digits.
 *
 * Example 1:
 * Given s = "internationalization", abbr = "i12iz4n":
 * Return true.
 *
 * Example 2:
 * Given s = "apple", abbr = "a2e":
 * Return false.
 */

public class Solution408 {

    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        for (char c: abbr.toCharArray()) {
            if (Character.isDigit(c)) {
                if (c == '0' && sb.length() == 0)
                    return false;
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    i += Integer.parseInt(sb.toString());
                    if (i >= word.length())
                        return false;
                    sb.setLength(0);
                }
                if (word.charAt(i) != c)
                    return false;
                i++;
            }
        }
        if (sb.length() > 0)
            i += Integer.parseInt(sb.toString());
        return i == word.length();
    }
}