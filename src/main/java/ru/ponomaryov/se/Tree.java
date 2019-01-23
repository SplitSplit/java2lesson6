package ru.ponomaryov.se;

public interface Tree {

    void add(int value);

    boolean remove(int value);

    boolean find(int value);

    public int getSize();

    boolean isEmpty();

    void traverse(TraverseMode mode);

    void displayTree();

    boolean isBalanced();
}
