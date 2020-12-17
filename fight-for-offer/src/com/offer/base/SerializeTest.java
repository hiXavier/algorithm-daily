package com.offer.base;

import java.io.*;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/8/5 14:45
 */
public class SerializeTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.height = 190;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Xavier"));) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 改变 static 字段的值
        student.weight = 66.9;

// 从文件中读出对象
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Xavier")));) {
            Student wanger1 = (Student) ois.readObject();
            System.out.println(wanger1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
// Wanger{name=王二,age=18,pre=
    }
}


class Student extends Person implements Serializable {
    private static final long serialVersionUID = 1491919419017993927L;
    String name = "zhangsan";
    int age = 20;
    transient int score = 100;
    static double weight = 60.2;
}

class Person {
    double height = 180;
}