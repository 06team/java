package com.benben;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class firstUniqChar {
    public static void main(String[] args) {
        int result=query("deabafgbfg");
        System.out.println(result);
    }
    /*
    给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     */
    public static int query(String s){
        HashMap<String,Integer> map1=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            System.out.println(map1.containsKey(String.valueOf(s.charAt(i))));
            if(map1.containsKey(String.valueOf(s.charAt(i)))){
                Integer c=map1.get(String.valueOf(s.charAt(i)))+1;
                System.out.println(c);
                map1.put(String.valueOf(String.valueOf(s.charAt(i))),c);
            }
            else{
                map1.put(String.valueOf(s.charAt(i)),1);
            }
        }
        System.out.println(map1);
        for(String b:map1.keySet()){
            if(map1.get(b)==1){
                return s.indexOf(b);
            }

        }
        return  -1;
    }


}
