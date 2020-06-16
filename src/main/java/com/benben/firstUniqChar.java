package com.benben;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstUniqChar {
    public static void main(String[] args) {
        //int result = query("deabafgbfg");
        int result=query("ddeeabafgbfg");
        System.out.println(result);
    }

    /*
    给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
    思路：
    1、因为要找到第一个不重复的字符，用LinkedHashMap保证有序
    2、遍历子符串，查看map中key是否包含该字符，包含的话就把该key对应的值+1，否则添加该字符为key到map中，值为1
    3、遍历map，查看第一个值为1的key即为第一个不重复的字符，然后在用index在字符串中找到索引位置
     */

    public static int query(String s){
        //HashMap<Object,Integer> map1=new LinkedHashMap<>();
        HashMap<String,Integer> map1=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            System.out.println(map1.containsKey(String.valueOf(s.charAt(i))));
            if (map1.containsKey(String.valueOf(s.charAt(i)))) {
                Integer c = map1.get(String.valueOf(s.charAt(i))) + 1;
                System.out.println(c);
                map1.put(String.valueOf(String.valueOf(s.charAt(i))), c);
            } else {
                map1.put(String.valueOf(s.charAt(i)), 1);
            }
        }
        System.out.println(map1);
        for (String b : map1.keySet()) {
            if (map1.get(b) == 1) {
                return s.indexOf(b);
            }

        }
        return -1;
    }


}
