-Xms256m
-Xmx512m
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=Сonclusions.md
-XX:+UseSerialGC

-----------------------------------
SerialGC
-XX:+UseSerialGC


Young generation - Copy
Old generation - MarkSweepCompact

Starting PID: 8504@Vlad
нояб. 19, 2019 11:21:33 PM ru.otus.hw3.GCMonitor init
INFO: Listening to: Copy
нояб. 19, 2019 11:21:33 PM ru.otus.hw3.GCMonitor init
INFO: Listening to: MarkSweepCompact
нояб. 19, 2019 11:22:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 1 collection(s) took 176 ms
нояб. 19, 2019 11:22:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:23:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 1 collection(s) took 233 ms
нояб. 19, 2019 11:23:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:24:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 1 collection(s) took 265 ms
нояб. 19, 2019 11:24:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:25:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 1 collection(s) took 256 ms
нояб. 19, 2019 11:25:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 1 collection(s) took 801 ms
нояб. 19, 2019 11:26:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:26:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:27:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 1 collection(s) took 394 ms
нояб. 19, 2019 11:27:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:28:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:28:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:29:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 1 collection(s) took 0 ms
нояб. 19, 2019 11:29:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 2 collection(s) took 3175 ms
нояб. 19, 2019 11:30:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:30:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 1 collection(s) took 2018 ms
нояб. 19, 2019 11:31:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: Copy (Сonclusions): 0 collection(s) took 0 ms
нояб. 19, 2019 11:31:33 PM ru.otus.hw3.GCMonitor$3 run
INFO: MarkSweepCompact (Сonclusions): 0 collection(s) took 0 ms
java.lang.OutOfMemoryError: Java heap space
Dumping heap to �onclusions.md ...
Heap dump file created [876385136 bytes in 16.281 secs]
Exception in thread "main" 
Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "main"
Exception in thread "Timer-0" 
Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "Logging-Cleaner"

Process finished with exit code 1
----------------------------------------------------------------
Young	6 collections in 1324 ms
Old	    4 collections in 5994 ms
----------------------------------------------------------------

ParallelGC
-XX:+UseParallelGC

Young generation - PS Scavenge
Old generation - PS MarkSweep
  
Starting PID: 6416@Vlad
нояб. 19, 2019 11:49:36 PM ru.otus.hw3.GCMonitor init
INFO: Listening to: PS MarkSweep
нояб. 19, 2019 11:49:36 PM ru.otus.hw3.GCMonitor init
INFO: Listening to: PS Scavenge
нояб. 19, 2019 11:50:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS MarkSweep (GC): 0 collection(s) took 0 ms
нояб. 19, 2019 11:50:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS Scavenge (GC): 1 collection(s) took 187 ms
нояб. 19, 2019 11:51:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS MarkSweep (GC): 0 collection(s) took 0 ms
нояб. 19, 2019 11:51:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS Scavenge (GC): 1 collection(s) took 237 ms
нояб. 19, 2019 11:52:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS MarkSweep (GC): 1 collection(s) took 1341 ms
нояб. 19, 2019 11:52:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS Scavenge (GC): 1 collection(s) took 358 ms
нояб. 19, 2019 11:53:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS MarkSweep (GC): 0 collection(s) took 0 ms
нояб. 19, 2019 11:53:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS Scavenge (GC): 0 collection(s) took 0 ms
нояб. 19, 2019 11:54:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS MarkSweep (GC): 0 collection(s) took 0 ms
нояб. 19, 2019 11:54:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS Scavenge (GC): 1 collection(s) took 490 ms
нояб. 19, 2019 11:55:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS MarkSweep (GC): 1 collection(s) took 2569 ms
нояб. 19, 2019 11:55:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS Scavenge (GC): 0 collection(s) took 0 ms
нояб. 19, 2019 11:56:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS MarkSweep (GC): 0 collection(s) took 0 ms
нояб. 19, 2019 11:56:36 PM ru.otus.hw3.GCMonitor$3 run
INFO: PS Scavenge (GC): 0 collection(s) took 0 ms
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.base/java.util.Arrays.copyOf(Arrays.java:3721)
	at java.base/java.util.Arrays.copyOf(Arrays.java:3690)
	at java.base/java.util.ArrayList.grow(ArrayList.java:235)
	at java.base/java.util.ArrayList.grow(ArrayList.java:242)
	at java.base/java.util.ArrayList.add(ArrayList.java:452)
	at java.base/java.util.ArrayList.add(ArrayList.java:465)
	at ru.otus.hw3.Benchmark.run(Benchmark.java:29)
	at ru.otus.hw3.MainClass.main(MainClass.java:35)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:567)
	at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)

Process finished with exit code 1
-------------------------------------------------------------------------------
Total:
Young	4 collections in 1272 ms
Old	    2 collections in 3910 ms


--------------------------------------------------------------------------------
-XX:+UseG1GC


Young generation - G1 Young Generation
Old generation - G1 Old Generation

нояб. 20, 2019 8:04:46 PM ru.otus.hw3.GCMonitor init
INFO: Listening to: G1 Young Generation
нояб. 20, 2019 8:04:47 PM ru.otus.hw3.GCMonitor init
INFO: Listening to: G1 Old Generation
нояб. 20, 2019 8:05:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 4 collection(s) took 237 ms
нояб. 20, 2019 8:05:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:06:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 2 collection(s) took 138 ms
нояб. 20, 2019 8:06:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:07:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 2 collection(s) took 160 ms
нояб. 20, 2019 8:07:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:08:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 2 collection(s) took 83 ms
нояб. 20, 2019 8:08:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:09:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 2 collection(s) took 157 ms
нояб. 20, 2019 8:09:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:10:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 3 collection(s) took 121 ms
нояб. 20, 2019 8:10:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:11:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 1 collection(s) took 99 ms
нояб. 20, 2019 8:11:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:12:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 2 collection(s) took 106 ms
нояб. 20, 2019 8:12:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms
нояб. 20, 2019 8:13:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 2 collection(s) took 240 ms
нояб. 20, 2019 8:13:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 1 collection(s) took 1240 ms
нояб. 20, 2019 8:14:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Young Generation (GC): 2 collection(s) took 132 ms
нояб. 20, 2019 8:14:47 PM ru.otus.hw3.GCMonitor$3 run
INFO: G1 Old Generation (GC): 0 collection(s) took 0 ms

Exception: java.lang.OutOfMemoryError thrown from the UncaughtExceptionHandler in thread "main"

Process finished with exit code 1

Total:
----------------------------------------------------------------
Young	22 collections in 1470 ms
Old	    0 collections in 0 ms



G1 лучше всего справляется с конкретной задачей в данной среде (доступная память, количество процессоров )