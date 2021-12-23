package com.offer.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/7/16 11:54
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        Iterator<String> iteratora = linkedList.iterator();
        Iterator<String> iteratorb = linkedList.iterator();
        System.out.println(iteratora.next());
        iteratora.remove();
        System.out.println(iteratorb.next());

        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        Iterator<String> iterator1 = names.iterator();
        Iterator<String> iterator2 = names.iterator();
        System.out.println(iterator1.next());
        iterator1.remove();
        System.out.println(iterator2.next()); // 运行结
    }
}
