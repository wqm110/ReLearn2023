package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author wangqingao
 */
public class LoggerService {
    private static final LoggerService SERVICE = new LoggerService();

    private final MyLogger myLogger;

    private final List<MyLogger> myLoggerList;

    private LoggerService() {
        ServiceLoader<MyLogger> loader = ServiceLoader.load(MyLogger.class);
        List<MyLogger> list = new ArrayList<>();
        for (MyLogger log : loader) {
            list.add(log);
        }
        // LoggerList 是所有 ServiceProvider
        myLoggerList = list;
        if (!list.isEmpty()) {
            // Logger 只取一个
            myLogger = list.get(0);
        } else {
            myLogger = null;
        }
    }

    public static LoggerService getService() {
        return SERVICE;
    }

    public void info(String msg) {
        if (myLogger == null) {
            System.out.println("info 中没有发现 Logger 服务提供者");
        } else {
            myLogger.info(msg);
        }
    }

    public void debug(String msg) {
        if (myLoggerList.isEmpty()) {
            System.out.println("debug 中没有发现 Logger 服务提供者");
        }
        myLoggerList.forEach(log -> log.debug(msg));
    }
}