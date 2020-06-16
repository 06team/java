package com.benben;

public class week_3 {


   /*方法一：
   编写一个 SQL 查询，查找所有至少连续出现三次的数字。
   select distinct(Num) as ConsecutiveNums from Logs where Id in
   (select a.Id from Logs a,Logs b,Logs c
where a.Num=b.Num and b.Num=c.Num and a.Id+1 = b.Id and b.Id+1=c.Id)

方法二：

(select distinct(a.Num) as ConsecutiveNums
from Logs a,Logs b,Logs c where a.Num=b.Num and b.Num=c.Num and a.Id+1 = b.Id and b.Id+1=c.Id)
*/
}
