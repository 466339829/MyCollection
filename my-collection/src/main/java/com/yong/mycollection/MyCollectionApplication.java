package com.yong.mycollection;

import com.yong.mycollection.list.MyArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCollectionApplication.class, args);

        //ArrayList
        MyArrayList<String> list = new MyArrayList<>();
        list.add("yong");
        System.out.println(list.get(0));
    }

}
