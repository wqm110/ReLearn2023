package org.example;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static javax.swing.UIManager.put;

@BenchmarkMode(Mode.AverageTime) // 测试完成时间
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS) // 预热 2 轮，每次 1s
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS) // 测试 5 轮，每次 1s
@Fork(1) // fork 1 个线程
@State(Scope.Thread) // 每个测试线程一个实例
public class HashMapCycleTest {
    static Map<Integer, String> map = new HashMap() {{
        // 添加数据
        for (int i = 0; i < 100; i++) {
            put(i, "val:" + i);
        }
    }};

    public static void main(String[] args) throws RunnerException {
        // 启动基准测试
        LocalDate now = LocalDate.now();
        Options opt = new OptionsBuilder()
                // 要导入的测试类
                .include(HashMapCycleTest.class.getSimpleName())
                // 输出测试结果的文件
//                .output("/Users/wqm/java/JavaFuXi/javaLearnT/collection/log/jmh-map" + now + ".log")
                .build();
        // 执行测试
        new Runner(opt).run();
    }

    @Benchmark
    public void entrySet() {
        // 遍历
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
        }
    }

    @Benchmark
    public void forEachEntrySet() {
        // 遍历
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
        }
    }

    @Benchmark
    public void keySet() {
        // 遍历
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer k = iterator.next();
            String v = map.get(k);
        }
    }

    @Benchmark
    public void forEachKeySet() {
        // 遍历
        for (Integer key : map.keySet()) {
            Integer k = key;
            String v = map.get(k);
        }
    }

    @Benchmark
    public void lambda() {
        // 遍历
        map.forEach((key, value) -> {
            Integer k = key;
            String v = value;
        });
    }

    @Benchmark
    public void streamApi() {
        // 单线程遍历
        map.entrySet().stream().forEach((entry) -> {
            Integer k = entry.getKey();
            String v = entry.getValue();
        });
    }

    public void parallelStreamApi() {
        // 多线程遍历
        map.entrySet().parallelStream().forEach((entry) -> {
            Integer k = entry.getKey();
            String v = entry.getValue();
        });
    }
}