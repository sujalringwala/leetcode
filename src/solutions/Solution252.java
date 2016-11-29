package solutions;

import common.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 252. Meeting Rooms
 *
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all
 * meetings.
 *
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]], return false.
 */

public class Solution252 {
    public boolean canAttendMeetings(Interval[] intervals) {
        if (intervals.length < 2) return true;

        // Sort the intervals by start time
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                if (i1.start == i2.start)
                    return 0;
                return i1.start < i2.start ? -1: 1;
            }
        });
        for (int i = 0, j = 1; j < intervals.length; i++, j++) {
            if (intervals[i].end > intervals[j].start) return false;
        }
        return true;
    }
}