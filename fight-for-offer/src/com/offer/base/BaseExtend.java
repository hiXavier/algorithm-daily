package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/5 13:53
 */
public class BaseExtend {
    BaseExtend() {
        System.out.println("Base");
    }

    BaseExtend(String str) {
        System.out.println("Parents");
    }
}

class Son extends BaseExtend {
    Son() {
        System.out.println("Son");
    }

    Son(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        try {
            int i = 100 / 0;
            System.out.print(0);
        } catch (Exception e) {
            System.out.print(1);
            throw new RuntimeException();
        } finally {
            System.out.print(2);
        }
        System.out.print(3);
    }
}
