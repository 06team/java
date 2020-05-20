package com.benben;

public class numDupDigits {
    /*
    至少有 1 位重复的数字
给定正整数 N，返回小于等于 N 且具有至少 1 位重复数字的正整数的个数。 示例 1：

输入：20 输出：1 解释：具有至少 1 位重复数字的正数（<= 20）只有 11 。 示例 2：

输入：100 输出：10 解释：具有至少 1 位重复数字的正数（<= 100）有 11，22，33，44，55，66，77，88，99 和 100 。
    思路：
    1、至少有一位重复的数字，最小的是11，所以所有小于11的直接返回0
    2、其他的从11开始遍历，直到给定的N
    3、设置一个记录总数的变量count
    4、查看每个遍历的数是否是至少有一位不重复的数字，是的话+1，否则继续遍历
     */
    public static  Integer cop(int n){
        int count=0;
        if(n<11){
            return 0;
        }
        //开始遍历
        else {
            for(int j=11;j<=n;j++){
                //调方法查看该数是否是至少一个重复数字的数
                if(c(j)){
                    count++;
                }
            }

        }
        System.out.println(count);
        return count;

    }
    public static  boolean c(int n){
        String s=String.valueOf(n);
        System.out.println(s);
        //遍历这个数字的字符串，
        for(int z=0;z<s.length();z++){
            //每次比较遍历的这个字符是否存在于之后所有的字符中，存在即满足至少有一个的条件
            System.out.println(s.substring(z+1));
            boolean b=s.substring(z+1).contains(String.valueOf(s.charAt(z)));
            System.out.println(b);
            if(b){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(cop(200));
    }
}
