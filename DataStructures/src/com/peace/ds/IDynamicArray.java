package com.peace.ds;

public interface IDynamicArray<T> {

    //appends value to end of dynamic array and returns the index
    int add(T value);
     boolean remove(T value);
     int get(int index);
     boolean set(int index, T value);
     boolean isEmpty();
     int size();
     void print();
}
