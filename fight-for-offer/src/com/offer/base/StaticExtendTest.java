package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/6 11:51
 */
public class StaticExtendTest {

    public static void main(String[] args) {
        new ChildOne();
        new ChildOne();
    }
}

class Root {
    static {
        System.out.print("1");
    }

    public Root() {
        System.out.print("2");
    }


}

class ChildOne extends Root {
    static {
        System.out.print("a");
    }

    public ChildOne() {
        System.out.print("b");
    }

    {
        System.out.print("c");
    }

}

