package com.fulh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName LogBackDemo
 * @Description LogBack 日志框架测试类
 * 1、先引用logback依赖
 * 2、在resources 目录下增加配置文件：logback.xml
 * 3、使用日志框架
 * @Author fulh
 * @Date 2019/10/5 12:59
 * @Version 1.0
 */
public class LogBackDemo {
    private final static Logger logger = LoggerFactory.getLogger(LogBackDemo.class);

    public void debugLog(){
        System.out.println("debug log begin ....");
        logger.debug("logback debug log msg ...");
        System.out.println("debug log end ....");
    }

    public void infoLog(){
        System.out.println("info log begin ....");
        logger.info("logback info log msg ...");
        System.out.println("info log end ....");
    }

    public void warnLog(){
        String msg = "logback warn log msg ...";
        System.out.println("warn log begin ....");
        logger.warn("{}",msg);
        System.out.println("warn log end ....");
    }

    public void errorLog(){
        System.out.println("error log begin ....");
        logger.error("logback error log msg ...");
        System.out.println("error log end ....");
    }

}
