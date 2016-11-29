package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 359. Logger Rate Limiter
 *
 * Design a logger system that receive stream of messages along with its
 * timestamps, each message should be printed if and only if it is not printed
 * in the last 10 seconds.
 *
 * Given a message and a timestamp (in seconds granularity), return true if the
 * message should be printed in the given timestamp, otherwise returns false.
 *
 * It is possible that several messages arrive roughly at the same time.
 */

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
