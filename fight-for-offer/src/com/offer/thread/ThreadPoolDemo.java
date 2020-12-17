package com.offer.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/12/17 16:24
 */
public class ThreadPoolDemo {

    public static void fixedPool(){
        ExecutorService fixedPool = Executors.newFixedThreadPool(5);
        fixedPool.execute(() ->{

        });

    }
}
