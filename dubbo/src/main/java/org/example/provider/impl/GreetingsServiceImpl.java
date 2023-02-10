package org.example.provider.impl;

import org.example.api.GreetingsService;

/**
 * @author wangqingao
 */
public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
}