package solutions;

import java.util.Arrays;
import java.util.List;

/**
 * 412. Fizz Buzz
 *
 * Write a program that outputs the string repr of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number
 * and for the multiples of five output “Buzz”. For numbers which are multiples
 * of both three and five output “FizzBuzz”.
 */

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