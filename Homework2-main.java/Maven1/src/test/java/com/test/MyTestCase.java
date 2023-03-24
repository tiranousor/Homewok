package com.test;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyTestCase {

    @Test
    public void test1() {
        String[] start = new String[]{"100", "100101", "11001000"};
        String[] expected_result = Main.getResult(start);
        String[] result = new String[]{"11001000", "100101", "100"};
        assertArrayEquals(result, expected_result);
    }
}