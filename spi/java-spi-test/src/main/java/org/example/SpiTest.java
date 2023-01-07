package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class SpiTest {
    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();
        loggerService.info("你好");
        loggerService.debug("测试Java SPI 机制");
        int a = 1000_3434_3;
        HashSet set =new HashSet(2);

        int n = -1 >>> Integer.numberOfLeadingZeros(2 - 1);

        System.out.println(n);
        int b = 1 << 30;
        System.out.println("b="+b);

    }
}