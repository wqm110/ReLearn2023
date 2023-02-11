package org.example;


/**
 * @author wqm
 */
public class MyLogback implements MyLogger {
    @Override
    public void info(String s) {
        System.out.println("MyLogback info 打印日志：" + s);
    }

    @Override
    public void debug(String s) {
        System.out.println("MyLogback debug 打印日志：" + s);
    }
}