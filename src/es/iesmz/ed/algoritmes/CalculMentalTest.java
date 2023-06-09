package es.iesmz.ed.algoritmes;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class CalculMentalTest {

    @Test
    public void test1() {
        String operacion = "15 + 8 - 7 + 10 - 3";
        Integer[] esperado = {15, 23, 16, 26, 23};
        ArrayList<Integer> resultados = new CalculMental(operacion).calcula();
        Assert.assertArrayEquals(esperado, resultados.toArray());
    }

    @Test
    public void test2() {
        String operacion = "10 + 5 - 3 + 2 - 1";
        Integer[] esperado = {10, 15, 12, 14, 13};
        ArrayList<Integer> resultados = new CalculMental(operacion).calcula();
        Assert.assertArrayEquals(esperado, resultados.toArray());
    }

    @Test
    public void test3() {
        String operacion = "20 - 10 + 5 + 2 - 7";
        Integer[] esperado = {20, 10, 15, 17, 10};
        ArrayList<Integer> resultados = new CalculMental(operacion).calcula();
        Assert.assertArrayEquals(esperado, resultados.toArray());
    }


}