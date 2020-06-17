package com.benben;

import java.util.ArrayList;
import java.util.List;

public class week_6 {
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
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        push("12",l);
        //push("15",l);
        //push("13",l);
        pop(l);
        top(l);
        empty(l);
    }

    public static void push(String x, List l){
        l.add(x);
        System.out.println(l);
    }
    public static void pop(List l){
        if(l.size()!=0){
            System.out.println("移除栈顶元素是："+l.remove(l.size()-1));
            System.out.println(l);
        }else{
            System.out.println("栈为空");
        }

    }
    public static  void top(List l){
        if(l.size()!=0) {
            System.out.println("栈顶元素是：" + l.get(l.size() - 1));
            System.out.println(l);
        }else{
            System.out.println("栈为空");
        }

    }
    public static void empty(List l){
        if(l.size()==0){
            System.out.println("栈为空");
        }else{
            System.out.println("栈不为空");
        }
    }
}
