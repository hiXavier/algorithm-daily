package com.offer.thread;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/13 16:22
 */
public class DeadLockThreadDemo {
    public static String stringA = "A";
    public static String stringB = "B";

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            synchronized (stringA) {
                System.out.println("Thread A Get A, wait B");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (stringB) {
                    System.out.println("Thread A Get A and B");
                }
            }
        });
        Thread threadB = new Thread(() -> {
            synchronized (stringB) {
                System.out.println("Get B, wait A");
                synchronized (stringA) {
                    System.out.println("Thread B Get A and B");
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
