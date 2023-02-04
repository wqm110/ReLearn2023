package org.example;

import lombok.extern.slf4j.Slf4j;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author wqm
 */
@Slf4j
@BenchmarkMode(Mode.AverageTime) // 测试完成时间
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS) // 预热 2 轮，每次 1s
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS) // 测试 5 轮，每次 1s
@Fork(1) // fork 1 个线程
@State(Scope.Thread) // 每个测试线程一个实例
public class Debug {
    @Benchmark
    public  void main() {
        List<String> list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list.add(String.valueOf(i));
        }

        List<String> collect = list.stream().filter(x -> Integer.valueOf(x) > 8).collect(Collectors.toList());
        for (String s : collect) {
            log.debug(s);
        }
    }
}
