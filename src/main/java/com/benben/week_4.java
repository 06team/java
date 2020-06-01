package com.benben;

import java.util.Scanner;

public class week_4 {
   /*
    判断某一年是否为闰年
    通过Scanner 输入一个年份，然后判断该年是否是闰年
    请用三种方法实现
     是闰年的条件：能被4整数但不能被100整除，或者能被400整除的年份都是闰年。
   */
   public static void run(int year){
       if(year%4==0&year%100!=0 |(year%400==0)){
           System.out.println(year+"是闰年");
       }

   }
   public static void run1(int year){
       if(year%4==0&year%100!=0 ){
           System.out.println(year+"是闰年");
       }
       else if(year%400==0){
           System.out.println(year+"u是闰年");
       }
   }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//创建一个键盘扫描类对象
        System.out.print("请您输入年份:");
        int contents=input.nextInt(); //输入整型
        run(contents);
        run1(contents);
    }
}
