package es.iesmz.ed.algoritmes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalculMentalTest {

    @Test
    public void test1() {
        String input1 = "15 + 8 - 7 + 10 - 3";
        Integer[] expected1 = {15, 23, 16, 26, 23};
        ArrayList<Integer> resultados1 = new CalculMental(input1).calcula();
        Assert.assertArrayEquals(expected1, resultados1.toArray());
    }

    @Test
    public void test2() {
        String input2 = "10 + 5 - 3 + 2 - 1";
        Integer[] expected2 = {10, 15, 12, 14, 13};
        ArrayList<Integer> resultados2 = new CalculMental(input2).calcula();
        Assert.assertArrayEquals(expected2, resultados2.toArray());
    }

    @Test
    public void test3() {
        String input3 = "20 - 10 + 5 + 2 - 7";
        Integer[] expected3 = {20, 10, 15, 17, 10};
        ArrayList<Integer> resultados3 = new CalculMental(input3).calcula();
        Assert.assertArrayEquals(expected3, resultados3.toArray());
    }


}