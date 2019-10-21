package ru.otus.hw2;

import ru.otus.hw2.DIYarrayList;

import java.util.List;

public class DIYarrayListTest {

    public static void main(String[] args) {
        List<String> diyArrayList1 = new DIYarrayList<>();
        List<String> diyArrayList2 = new DIYarrayList<>(12);

       String[] a = new String[11];
        for (int i = 0; i < a.length ; i++) {
            a[i] = "" + i;
        }
        java.util.Collections.addAll(diyArrayList1,a);
        java.util.Collections.copy(diyArrayList2, diyArrayList1);
        java.util.Collections.sort(diyArrayList2, String::compareTo);
        java.util.Collections.sort(diyArrayList1, String::compareTo);
        for (int i = 0; i <diyArrayList1.size(); i++) {
            System.out.println(diyArrayList1.get(i));
            System.out.println(diyArrayList2.get(i));
        }
    }

}
