package interfaces;

import java.util.List;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
public interface NestedInteger {

    // @return true if this interfaces.NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this interfaces.NestedInteger holds, if it holds a single integer
    // Return null if this interfaces.NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this interfaces.NestedInteger holds, if it holds a nested list
    // Return null if this interfaces.NestedInteger holds a single integer
    public List<NestedInteger> getList();
}
