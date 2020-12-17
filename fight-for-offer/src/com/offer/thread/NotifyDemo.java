package com.offer.thread;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/12/15 14:06
 */
public class NotifyDemo {
    public static void main(String[] args) {
        // 创建工厂类
        ItemFactory factory = new ItemFactory();

        // 生产者
        Thread producer = new Thread(() -> {
            try {
                factory.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "生产者");
        producer.start();

        // 消费者
        Thread consumer = new Thread(() -> {
            try {
                factory.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "消费者");
        consumer.start();
    }

}
