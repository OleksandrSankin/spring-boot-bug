package com.bug;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2 extends AbstractTest {

    @Test
    public void test2() {
        String body = getRestTemplate().getForEntity(getUrl() + "/hello", String.class).getBody();
        assertEquals("hello", body);
    }
}
