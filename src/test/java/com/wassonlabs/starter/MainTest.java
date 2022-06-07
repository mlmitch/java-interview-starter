package com.wassonlabs.starter;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testEchoInt() {
        int number = 1;
        Assert.assertEquals(number, Main.echoInt(number));
    }
}
