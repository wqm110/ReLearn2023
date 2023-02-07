package org.example;

import org.openjdk.jmh.runner.RunnerException;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author wangqingao
 */
public class Main {
    public static void main(String[] args) throws RunnerException {
//        HashMapCycleTest.main(args);
        String str = "";
        str.contains("a");
        HashSet set = new HashSet();
        set.add(null);
        System.out.println(set);


        HashMap map = new HashMap(16);
        Object s = map.put("s", str);
        System.out.println(s);
        Object clone = map.clone();
    }
}