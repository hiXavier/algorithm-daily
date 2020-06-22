package com.offer.stack;

import java.util.Stack;

/**
 * @author wuyanfeng
 * @description
 * @date 2020/6/22 17:08
 */
public class QueueOfTwoStack<E> {
    /**
     * 只管push的栈
     */
    private Stack<E> pushStack;
    /**
     * 只管pop的栈
     */
    private Stack<E> popStack;

    public void push(E e) {
        pushStack.push(e);
    }

    public E pop() throws NullPointerException {
        if (pushStack == null || pushStack.size() == 0) {
            throw new NullPointerException("队列为空");
        }
        if (popStack.size() == 0) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    public QueueOfTwoStack(){
        popStack = new Stack<>();
        pushStack = new Stack<>();
    }

    public static void main(String[] args) {
        QueueOfTwoStack<Integer> queue = new QueueOfTwoStack<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
    }
}
