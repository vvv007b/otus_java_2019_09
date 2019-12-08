package ru.otus.hw3;

import java.util.ArrayList;
import java.util.List;

public class Benchmark implements BenchmarkMBean{

    private volatile int size;
    private List<String> arrayList = new ArrayList<>();


    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public void run() throws Exception {

        while (true) {

            int local = size;

            for (int i = 0; i < local; i++) {
                arrayList.add(new String(new char[0]));
            }

            Thread.sleep(5000);

            for (int i = local - 1; i <= local / 2; i--) {
                arrayList.remove(i);
            }

            Thread.sleep(5000);

        }
    }

}
