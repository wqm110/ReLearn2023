package org.example;

import org.openjdk.jmh.runner.RunnerException;

/**
 * @author wangqingao
 */
public class Main {
    public static void main(String[] args) throws RunnerException {
        HashMapCycleTest.main(args);
        String str = "";
        str.contains("a");
    }
}