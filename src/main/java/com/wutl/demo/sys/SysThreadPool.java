package com.wutl.demo.sys;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wutl
 * @Title: 系统线程池
 * @Package
 * @Description:
 * @date 2021-2-22 13:42
 */
public class SysThreadPool {

    public static ThreadPoolExecutor executor = null;

    /**
     * 初始线程池
     */
    public static void initThreadPool(){
        executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));
        executor.execute(new Thread(()->{
            System.out.println("initThreadPool...");
        }));
    }
}
