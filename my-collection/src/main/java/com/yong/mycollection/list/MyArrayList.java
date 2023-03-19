package com.yong.mycollection.list;


public class MyArrayList<T> {

    Object[] objects;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList(){

    }

    public void add(T t){
        if (objects==null){
            objects = new Object[DEFAULT_CAPACITY];
        }
        objects[size++] = t;
    }

    public T get(int index){
        return (T)objects[index];
    }



}
