package com.benben;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class d {
    static List<String> l = new ArrayList<String>();

    public static void main(String[] args) {
        push("12");
        //push("15",l);
        //push("13",l);
        pop();
        top();
        empty();

    }

    /**
     * Initialize your data structure here.
     */
    public d() {
    }

    /**
     * Push element x onto stack.
     */
    public static void push(String x) {
        l.add(x);
        System.out.println(l);

    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public static String pop() {
        if (l.size() != 0) {
            String n=l.remove(l.size() - 1);
            System.out.println("移除栈顶元素是：" + n);
            System.out.println(l);
            return n;
        } else {
            System.out.println("栈为空");
            return "栈为空";
        }

    }

    /**
     * Get the top element.
     */
    public static String top() {
        if (l.size()!= 0) {
            System.out.println("栈顶元素是：" + l.get(l.size() - 1));
            System.out.println(l);
            return l.get(l.size() - 1);
        } else {
            System.out.println("栈为空");
            return "栈为空";
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public static boolean empty() {
        if (l.size() == 0) {
            System.out.println("栈为空");
            return true;
        } else {
            System.out.println("栈不为空");
            return false;
        }
    }


}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

