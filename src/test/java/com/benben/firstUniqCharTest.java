package com.benben;


import org.testng.Assert;
import org.testng.annotations.Test;

public class firstUniqCharTest {

    @Test
    public void test1(){
        firstUniqChar f=new firstUniqChar();
        int result=f.query("deabafgbfg");
        Assert.assertEquals(0,result);


    }
}
