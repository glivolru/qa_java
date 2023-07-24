package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatMeowTest {
    private Feline feline;

    public CatMeowTest(Feline feline) {
        this.feline = feline;
    }

    @Test
    public void getCatSound(){
        Cat cat = new Cat(feline);
        String expectedCatSound = cat.getSound();
        String actualCatSound = "Мяу";
        assertEquals(expectedCatSound,actualCatSound);
    }
}
