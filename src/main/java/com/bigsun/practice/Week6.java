package com.bigsun.practice;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
   push(x) -- 元素 x 入栈
   pop() -- 移除栈顶元素
   top() -- 获取栈顶元素
   empty() -- 返回栈是否为空
   注意:
   你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
   你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
   你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
    */
public class Week6 {



    /**
     * 队列和栈
     */

    public void push(List queen,String x) {
        queen.add(x);
    }

    public void pop(List queue) {
        if (empty(queue))
        {
            System.out.println("栈为空");
        }
        else
        {
            System.out.println(queue.get(queue.size()-1));
           queue.remove(queue.size()-1);
            System.out.println(queue.size());
        }
    }

    public Object top(List queue) {
        if (empty(queue))
        {
            System.out.println("栈为空");
            return null;
        }
        else
        {
            System.out.println(queue.get(queue.size()-1));
            return queue.get(queue.size()-1);
        }
    }

    public Boolean empty(List queue) {
        if (queue.size() == 0) {
//            System.out.println("栈为空");
            return true;
        } else {
            return queue.isEmpty();
        }
    }

    @Test
    public void get() {
        List queue = new ArrayList();
        push(queue,"1");
        push(queue,"2");
        push(queue,"3");
        System.out.println(empty(queue));
        top(queue);
        pop(queue);
    }
}
