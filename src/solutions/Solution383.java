package solutions;

/**
 * 383. Ransom Note
 *
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 */

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        for (char c: ransomNote.toCharArray()) counts[c - 'a']++;
        for (char c: magazine.toCharArray()) counts[c - 'a']--;
        for (int count: counts) {if (count > 0) return false;}
        return true;
    }
}