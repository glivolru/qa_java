package com.example;

import org.junit.Test;

public class LionOneMoreTest {
    protected Feline feline;
    @Test(expected = Exception.class)

    public void getSexException() throws Exception {
        new Lion("Лев",feline);
    }
}