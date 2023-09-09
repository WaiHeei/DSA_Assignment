package adt;

import entity.Student;

import java.util.Iterator;

public interface TreeSetInterface<T> {
    // Adds the specified element to this set if it is not already present.
    public void add(T t);

    boolean contains(T t);

    public boolean isEmpty();

    // Removes the specified element from this set if it is present.
    public void remove(T t);

    // Returns the number of elements in this set.
    public int size();

    Iterator<T> getIterator();


}
