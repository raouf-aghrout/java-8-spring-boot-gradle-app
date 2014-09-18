package com.tw.hello;

import com.tw.hello.controller.Greeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void greeterShouldSayHelloWorld() throws Exception {
        Greeter greeter = new Greeter();
        assertEquals("Hello World!", greeter.sayHelloWorld());
    }
}
