package solutions;

import java.util.ArrayList;
import java.util.List;


public class Solution293 {
    public List<String> generatePossibleNextMoves(String s) {

        List<String> states = new ArrayList<>();

        for (int i = 0, j = 1; j < s.length(); i++, j++) {
            if (s.charAt(i) == '+' && s.charAt(j) == '+')
                states.add(s.substring(0, i) + "--" + s.substring(j + 1));
        }
        return states;
    }
}
