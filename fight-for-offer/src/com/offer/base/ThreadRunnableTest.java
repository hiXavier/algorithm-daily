package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/7 10:48
 */
public class ThreadRunnableTest implements Runnable {
    private int i;

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println(Thread.currentThread().getName() + " " + j);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                ThreadRunnableTest threadRunnableTest = new ThreadRunnableTest();
                new Thread(threadRunnableTest, "newT1").start();
                new Thread(threadRunnableTest, "newT2").start();
            }
        }
    }
}
