import interfaces.NestedInteger;
import java.util.List;

public class Solution339 {

    public int depthSum(List<NestedInteger> nestedList) {
        return this.helper(nestedList, 1);
    }

    public int helper(List<NestedInteger> nestedList, int depth) {
        int total = 0;
        for (NestedInteger elem : nestedList) {
            if (elem.isInteger())
                total += elem.getInteger() * depth;
            else
                total += helper(elem.getList(), depth + 1);
        }
        return total;
    }
}
