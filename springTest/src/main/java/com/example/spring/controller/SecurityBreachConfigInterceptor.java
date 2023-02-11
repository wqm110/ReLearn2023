package com.example.spring.controller;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 安全漏洞全局拦截器
 *
 * @author lijihong
 * @date 2022/07/12
 */
@Slf4j
public class SecurityBreachConfigInterceptor implements HandlerInterceptor {

    /**
     * 前处理 解决安全漏洞：检测到目标服务器启用了OPTIONS方法 点击劫持：X-Frame-Options未配置 检测到目标Referrer-Policy响应头缺失 Content-Security-Policy响应头确实
     * 检测到目标X-Permitted-Cross-Domain-Policies响应头缺失 检测到目标X-Content-Type-Options响应头缺失 检测到目标X-XSS-Protection响应头缺失
     * 检测到目标X-Download-Options响应头缺失 点击劫持：X-Frame-Options未配置 HTTP Strict-Transport-Security缺失
     *
     * @param request  请求
     * @param response 响应
     * @param handler  处理程序
     * @return boolean
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, @NonNull Object handler) {
        log.info("request请求地址path[{}] uri[{}] , 已添加请求响应头 ！", request.getServletPath(), request.getRequestURI());
        // 解决安全漏洞：检测到目标服务器启用了OPTIONS方法
        response.setHeader("Access-Control-Allow-Origin", "*");
        // Access-Control-Allow-Credentials跨域问题
        response.setHeader("Access-Control-Allow-Credentials", "true");
        // 会话cookie缺少httponly属性
        response.setHeader("Set-Cookie", "name=value; HttpOnly");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS");
        response.setHeader("Access-Control-Max-Age", "86400");
        response.setHeader("Access-Control-Allow-Headers", "*");
        // 点击劫持：X-Frame-Options未配置
        response.addHeader("X-Frame-Options", "SAMEORIGIN");
        // 检测到目标Referrer-Policy响应头缺失
        response.addHeader("Referer-Policy", "origin");
        // Content-Security-Policy响应头确实
        response.addHeader("Content-Security-Policy", "object-src 'self'");
        // 检测到目标X-Permitted-Cross-Domain-Policies响应头缺失
        response.addHeader("X-Permitted-Cross-Domain-Policies", "master-only");
        // 检测到目标X-Content-Type-Options响应头缺失
        response.addHeader("X-Content-Type-Options", "nosniff");
        // 检测到目标X-XSS-Protection响应头缺失
        response.addHeader("X-XSS-Protection", "1; mode=block");
        // 检测到目标X-Download-Options响应头缺失
        response.addHeader("X-Download-Options", "noopen");
        // 点击劫持：X-Frame-Options未配置
        response.addHeader("X-Frame-Options", "SAMEORIGIN");
        // HTTP Strict-Transport-Security缺失
        response.addHeader("Strict-Transport-Security", "max-age=63072000; includeSubdomains; preload");

        // 如果是OPTIONS则结束请求
        if (HttpMethod.OPTIONS.toString().equals(request.getMethod())) {
            response.setStatus(HttpStatus.NO_CONTENT.value());
            log.info("find options request .....");
            return false;
        }
        return true;
    }
}