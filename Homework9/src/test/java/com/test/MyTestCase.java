package com.test;
import org.example.Product;
import org.example.ProductExceptions;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyTestCase {
    private Product product;
    @Test
    public void test1() throws ProductExceptions{
        int result = Calculator.multiply(2, 4);
        System.out.println(result);

        result = Calculator.multiply(3, 4); // вызовет ProductException
        System.out.println(result);
    }
}