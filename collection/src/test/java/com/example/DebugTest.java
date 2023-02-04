package com.example;

import org.example.Debug;
import org.example.HashMapCycleTest;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class DebugTest {
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                // 要导入的测试类
                .include(Debug.class.getSimpleName())
                // 输出测试结果的文件
//                .output("/Users/wqm/java/JavaFuXi/javaLearnT/collection/log/jmh-map" + now + ".log")
                .build();
        // 执行测试
        new Runner(opt).run();
    }
}
