package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/7 17:27
 */
public class ThreadPrintInTurn {
    int flag = 1;

    public synchronized void printChar(char ch) {
        System.out.print(ch);
    }

    public static void main(String[] args) {
        ThreadPrintInTurn turn = new ThreadPrintInTurn();
        Runnable aRunable = () -> {
            if (turn.flag == 1) {
                turn.printChar('A');
                turn.flag = 2;
                turn.notifyAll();
            }else {
                try {
                    turn.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable bRunable = () -> {
            if (turn.flag == 2) {
                turn.printChar('B');
                turn.flag = 3;
                turn.notifyAll();
            }else {
                try {
                    turn.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable cRunable = () -> {
            if (turn.flag == 3) {
                turn.printChar('C');
                turn.flag = 1;
                turn.notifyAll();
            }else {
                try {
                    turn.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(aRunable).start();
        new Thread(bRunable).start();
        new Thread(cRunable).start();
    }
}
