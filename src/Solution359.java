import java.util.HashMap;
import java.util.Map;

public class Solution359 {

    public class Logger {

        private Map<String, Integer> lastPrinted;

        public Logger() {
            lastPrinted = new HashMap<>();
        }

        public boolean shouldPrintMessage(int timestamp, String message) {
            if (!lastPrinted.containsKey(message)
                    || lastPrinted.get(message) + 10 <= timestamp) {
                lastPrinted.put(message, timestamp);
                return true;
            }
            return false;
        }
    }
}
