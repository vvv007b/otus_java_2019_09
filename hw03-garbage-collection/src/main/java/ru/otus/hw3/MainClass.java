package ru.otus.hw3;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class MainClass {
//-Xms256m
//-Xmx512m
//-XX:+HeapDumpOnOutOfMemoryError
//-XX:HeapDumpPath=Сonclusions.md

// GC  :
// -XX:+UseSerialGC
// -XX:+UseParallelGC
// -XX:+UseConcMarkSweepGC
// -XX:+UseG1GC



        public static void main(String[] args) throws Exception {

            System.out.println("Starting PID: " + ManagementFactory.getRuntimeMXBean().getName());

            int size = 300 * 1000;

            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
            ObjectName name = new ObjectName("ru.otus:type=Benchmark");
            Benchmark mbean = new Benchmark();
            mbs.registerMBean(mbean, name);

            GCMonitor.init();

            mbean.setSize(size);
            mbean.run();
        }
}
