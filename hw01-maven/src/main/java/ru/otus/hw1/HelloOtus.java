package ru.otus.hw1;

import com.google.common.collect.Lists;

import java.util.*;

public class HelloOtus {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        Collections.shuffle(arrayList);
        System.out.println(Lists.reverse(arrayList));


    }

}
