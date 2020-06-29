package com.benben;

import java.util.Random;

public class week_8 {
    /*
    1、java如何生成一个0-100的随机整数？
参考：http://www.wityx.com/post/807_1_1.html

2、编写一个方法求一个字符串的字节长度?
参考：http://www.wityx.com/post/809_1_1.html
     */

    public static void main(String[] args) {
        ran();
        len("zhang张") ;
    }
    public static void ran(){
        Random r=new Random();
        System.out.println(r.nextInt(100)); //[0, 100)

    }
    /*
    在纯baiASCII码下，字节数=字符串长度=字符个数，一个英文字母占一个字节的空间，
    一个中文汉字占两个字节的空间，一个二进制数字序列，在计算机中作为一个数字单元，
    一般为8位二进制数，换算为十进制，最小值0，最大值255。
     */
    public static void len(String str){
        int lent=0;
        for(int i=0;i<str.length();i++){
            //获取值
            char c=str.charAt(i);
            //转成ascii码
            int a=(byte)c;
            System.out.println(a);
            if(a>0&a<255){
                lent+=1;
            }else {
                lent+=2;
            }
        }
        System.out.println(lent);

    }
}
