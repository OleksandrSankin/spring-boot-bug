package com.bug;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 extends AbstractTest {

    @Test
    public void test1() {
        String body = getRestTemplate().getForEntity(getUrl() + "/hello", String.class).getBody();
        assertEquals("hello", body);
    }
}
