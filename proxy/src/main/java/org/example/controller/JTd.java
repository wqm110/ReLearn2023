package org.example.controller;

import org.example.service.JdkProxyFactory;
import org.example.service.SmsService;
import org.example.service.SmsServiceImpl;
import org.example.serviceCGLB.AliSmsService;
import org.example.serviceCGLB.CglibProxyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java/learn")
public class JTd {
    @GetMapping("/testJdk")
    public String proxyJdk(){
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
      return "";
    }
    @GetMapping("/testCglib")
    public String proxyCglib(){
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
      return "";
    }
}
