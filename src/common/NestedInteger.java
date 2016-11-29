package common;

import java.util.List;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
public interface NestedInteger {

    // @return true if this solutions.interfacesNestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this solutions.interfacesNestedInteger holds, if it holds a single integer
    // Return null if this solutions.NestedIntegertedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this solutions.interfacesNestedInteger holds, if it holds a nested list
    // Return null if this solutions.NestedIntegertedInteger holds a single integer
    public List<NestedInteger> getList();
}
