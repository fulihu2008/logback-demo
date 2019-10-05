package com.fulh;

import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName LogBackDemoTest
 * @Description TODO
 * @Author fulh
 * @Date 2019/10/5 13:08
 * @Version 1.0
 */
public class LogBackDemoTest {

    private LogBackDemo logBackDemo;

    @Before
    public void before(){
        logBackDemo = new LogBackDemo();
    }

    @Test
    public void debugLogTest(){
        logBackDemo.debugLog();
    }

    @Test
    public void infoLogTest(){
        logBackDemo.infoLog();
    }

    @Test
    public void warnLogTest(){
        logBackDemo.warnLog();
    }

    @Test
    public void errorLogTest(){
        logBackDemo.errorLog();
    }
}
