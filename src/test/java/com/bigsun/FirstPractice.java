package com.bigsun;

import com.bigsun.practice.Week1GetIndex;
import org.testng.annotations.Test;


public class FirstPractice {

    /**
     * create benben bigsun
     * 字符串中的第一个唯一字符
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     */
   @Test
    public void test(){
        Week1GetIndex week1GetIndex =new Week1GetIndex();
        System.out.print(week1GetIndex.getValue1("jkaHjkajm"));
    }





}
