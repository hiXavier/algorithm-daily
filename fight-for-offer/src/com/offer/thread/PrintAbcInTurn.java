package com.offer.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/17 10:36
 */
public class PrintAbcInTurn extends Thread {

    public static Lock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();

    private int order;

    static volatile int state = 0;

    public PrintAbcInTurn(int order) {
        this.order = order;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            try {
                while (state % 3 != order) {
                    condition.await();
                }
                System.out.print((char) ('A' + order));
                state++;
                condition.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        new PrintAbcInTurn(0).start();
        new PrintAbcInTurn(1).start();
        new PrintAbcInTurn(2).start();
    }

}
