package com.benben;


import java.util.ArrayList;
import java.util.List;

public class week_9 {
    /*
    最长不含重复字符的子字符串
请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

思路:
1、首先遍历子符串，把所有没有重复字符的放在一个list中
2、遍历list，找到最大的无重复字符
     */

    public static void sub(String s){
        List<String> lst = new ArrayList<String>();
        //ArrayList l= new ArrayList();

        for (int i=0;i<s.length();i++){
            String a = "";
            for (int j=i;j<s.length();j++) {

                //System.out.print(j);
                //System.out.println(a);
                if (a.contains(String.valueOf(s.charAt(j)))) {
                    //System.out.println("tiaochu ");
                    lst.add(a);
                    break;
                } else {
                    a += s.charAt(j);
                }
            }
        }
        System.out.println(lst);
        int num=0;
        for (String k:lst){
            if (k.length()>num){
                num=k.length();
            }
        }
        System.out.println(num);

    }

    public static void main(String[] args) {
        sub("abcabcbb");
        sub("bbbbb");

    }

}
