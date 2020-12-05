package com.peace.ds;

/*
    Double the size of array once the limit is reached and copy all elements to it
    1. Can grow AND shrink in size
    2. Can do Get(), Set()
    3. Add() appends to end
    4. Removing element wil shrink the array

    1. Create a ststic array with intial capacity
    2. As you add elements, keep track of number of elements added, once capacity exceeds,
    double teh size, copy all elements and add the element to be added.
 */
public class DynamicArray<T> implements IDynamicArray<T> {
    private int capacity;
    private int numOfEntries;
    private static final int CAPACITY_INCREASE_MULTIPLIER = 2;
    private static final int INITIAL_CAPACITY = 2;
    private T[] array;

    public static void main(String args[]){
        DynamicArray<String> da = new DynamicArray<String>();

        da.add("one");
        da.add("two");
        da.add("three");
        da.add("four");
        da.add("five");

        da.print();

    }

    DynamicArray(){
        capacity = INITIAL_CAPACITY;
        numOfEntries = 0;
        //array = new <T>[capacity];
        array = (T[]) new Object[capacity];
    }

    private void increaseCapacity(){
        capacity = capacity * CAPACITY_INCREASE_MULTIPLIER;
        T[] newArr = (T[]) new Object[capacity];

        for(int i = 0; i < numOfEntries; i++){
            newArr[i] = array[i];
        }
        array = newArr;
        return;
    }

    @Override
    public int add(T value) {
        if(numOfEntries == capacity){
            increaseCapacity();
        }
        array[numOfEntries++] = value;
        return numOfEntries - 1;
    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean set(int index, Object value) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void print() {
        for(int i = 0; i < numOfEntries; i++ ){
            System.out.print(" " + array[i]);
        }
        System.out.println();
        return;
    }

}
