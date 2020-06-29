package com.bigsun.practice;


import java.util.*;


/**
 * create benben bigsun
 * 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class Week1GetIndex {
    public String b;
    public int getValue1(String a){

       for (int i = 0;i<a.length();i++)
       {
           int f=0; //定义标志
          for (int j =1;j<a.length();j++)
          {
              if (i==j) //如果是同一个位置就跳过
              {
                  continue;
              }
              if (a.charAt(i) == a.charAt(j))
              {
                f=1;//如果存在相同标志变为1 跳出该次循环
                break;
              }
          }
          if (f==0)//如果循环一次轮发现 f仍旧为0就按输出当前i值
          {
              return i;
          }
       }
        return -1;
    }


//   public int getValue2(String a){
//       List<String> list=null;
//       String [] b=a.split("");//转成字符数组
//       list=  Arrays.asList(b);
//       Iterator iterator =list.iterator();
//
//      for (int i =0;i<a.length();i++)
//      {
//
//          int f=0;
//         while (iterator.hasNext())
//         {
//             iterator.next();
//            f++;
//         }
//          System.out.println(f);
//         if (f==1)
//         {
//             return i;
//         }
//
//      }
//
//       return -1;
//   }



}
