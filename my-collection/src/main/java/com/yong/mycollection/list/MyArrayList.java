package com.yong.mycollection.list;

import java.util.Arrays;

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
        if (size+1>objects.length){
            int oldCapacity = objects.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            objects = Arrays.copyOf(objects, newCapacity);
        }
        objects[size++] = t;
    }

    public T get(int index){
        return (T)objects[index];
    }

    public static void main(String[] args) {
        //ArrayList
        MyArrayList<String> list = new MyArrayList<>();
        for (int i =0;i<10;i++) {
            list.add("yong"+i);
        }
        for (int i =0;i<list.size;i++) {
            System.out.println(list.get(i));
        }
    }



}
