package solutions;

import java.util.Arrays;
import java.util.List;

public class Solution412 {
    public List<String> fizzBuzz(int n) {
        String[] result = new String[n];

        for (int i = 0, j = 1; i < n; i++, j++) {
            if (i % 3 == 0 && i % 5 == 0) result[i] = "FizzBuzz";
            else if (i % 3 == 0) result[i] = "Fizz";
            else if (i % 5 == 0) result[i] = "Buzz";
            else result[i] = String.valueOf(i);
        }
        return Arrays.asList(result);
    }
}