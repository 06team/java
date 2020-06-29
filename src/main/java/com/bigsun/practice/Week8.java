package com.bigsun.practice;

import org.testng.annotations.Test;

import java.util.Random;

/*
1、java如何生成一个0-100的随机整数？
参考：http://www.wityx.com/post/807_1_1.html

2、编写一个方法求一个字符串的字节长度?
参考：http://www.wityx.com/post/809_1_1.html
 */
public class Week8 {

    /**
     * 1、java如何生成一个0-100的随机整数？
     * 参考：http://www.wityx.com/post/807_1_1.html
     * 三种生成方式
     * 1.Random 对象 ，可以控制初始种子值，所调用方法 值域为0-设置的值
     * 2.Math.random([0,1)) 静态自带工具类,其实就是帮你创建了一个Random对象 需要自己用min max控制输出的值
     */
    @Test
    public void getNum() {
        Random random = new Random(); //[0,1)
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(100));
        }
    }

    @Test
    public void getNum2() {
        int min = 2, max = 20;
        for (int i = 0; i < 50; i++) {
            System.out.println((int) (Math.random() * (max - min + 1) + min));
        }
    }

    /**
     * 2、编写一个方法求一个字符串的字节长度?
     * 参考：http://www.wityx.com/post/809_1_1.html
     * getBytes 可以把字符传转成 byte类型 用数组存一存就好了
     */

    @Test
    public void getBitLength(){
       String name="zxw";
       byte [] buff = name.getBytes();
        System.out.println(buff.length);
    }
}
