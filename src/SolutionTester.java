import solutions.*;

import java.util.ArrayList;
import java.util.List;

public class SolutionTester {
    public static void main(String[] args) {

        Solution247 s = new Solution247();
        List<String> res = s.findStrobogrammatic(6);

        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for (String string: res) {
            if (string.startsWith("1")) {
                if (string.charAt(1) == '0') a++;
                else if (string.charAt(1) == '1') b++;
                else if (string.charAt(1) == '6') c++;
                else if (string.charAt(1) == '8') d++;
                else if (string.charAt(1) == '9') e++;
            }
        }
        System.out.printf("%d %d %d %d %d\n", a, b, c, d, e);
    }
}
