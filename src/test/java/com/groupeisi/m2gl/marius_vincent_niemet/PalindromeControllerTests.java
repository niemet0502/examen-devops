package com.groupeisi.m2gl.marius_vincent_niemet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PalindromeControllerTests {
    PalindromeController controller;

    @BeforeEach
    public void setup() {
        controller = new PalindromeController();
    }

    @Test
    public  void test_if_valid(){
        //arrange
        PalindromeInput input = new PalindromeInput();
        input.setMotAverifier("kayak");

        // act
        PalindromeOutput result = controller.checkpalindrome(input);

        //assert
        assertTrue(result.getIspalindrome());
    }

    @Test
    public  void test_if_invalid(){
        //arrange
        PalindromeInput input = new PalindromeInput();
        input.setMotAverifier("marius");

        // act
        PalindromeOutput result = controller.checkpalindrome(input);

        //assert
        assertFalse(result.getIspalindrome());
    }
}
