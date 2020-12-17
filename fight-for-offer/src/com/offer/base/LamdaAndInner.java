package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/10 10:34
 */
public class LamdaAndInner {
    private int age = 18;
    private static String name = "Forever young";

    public void test() {
        String slogan = "Long live";
        Displayable displayable = () -> {
            System.out.println("访问类的局部变量slogan=" + slogan);
            System.out.println("访问外部类的实例变量age=" + age);
            System.out.println("访问外部类变量name=" + name);
        };
        displayable.display();
        //调用接口的默认方法
        System.out.println(displayable.add(1,3));
    }

    public static void main(String[] args) {
        LamdaAndInner lamdaAndInner = new LamdaAndInner();
        lamdaAndInner.test();

    }
}

@FunctionalInterface
interface Displayable {
    void display();

    default int add(int a, int b) {
        return a + b;
    }
}
