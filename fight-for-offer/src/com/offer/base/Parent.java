package com.offer.base;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/5 15:10
 */
public class Parent {
    int age;

    public Parent() {
        age = 40;
    }

    public void eat() {
        System.out.println("parent eat");
    }
}

class Child extends Parent {
    int age;

    public Child() {
        age = 20;
    }

    @Override
    public void eat() {
        System.out.println("child eat");
        System.out.println("child age - " + super.age);
    }

    public void play() {
        System.out.println("child play");
    }
}

class ParentChildTest {
    public static void main(String[] args) {
        System.out.println("is "+ 100 + 5);
        System.out.println(100 + 5 +" is");
        System.out.println("is "+ (100 + 5));

        Parent parent = new Child();
        Child child = new Child();
        System.out.println("child-age " + child.age);
        System.out.println(parent.age);
        parent.eat();
    }
}

