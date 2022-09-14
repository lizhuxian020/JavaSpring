package com.zzstc;

import org.junit.Assert;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testSay() {
        App p = new App();
        String t = p.say("zzstc");
        Assert.assertEquals("hello zzstc", t);
    }
}
