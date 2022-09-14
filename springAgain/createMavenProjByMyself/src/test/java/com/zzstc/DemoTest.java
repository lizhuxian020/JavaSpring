package com.zzstc;

import org.junit.Test;
import org.junit.Assert;
public class DemoTest{
	@Test
	public void testSay() {
		Demo d = new Demo();
		String t = d.say("maven");
		Assert.assertEquals("hello maven", t);
	}	
}
