package com.offer.base;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/7 11:13
 */
public class CallableThread {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(()->{
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 的循环变量i的值：" + i);
            }
            return i;
        });

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值:" + i);
            if (i == 20) {
                new Thread(task, "newT1").start();
            }
        }
        try {
            System.out.println("task返回值： " + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
