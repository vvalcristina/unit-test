package services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private CalculadoraService calculadora;

    @Before
    public void setup(){
        calculadora = new CalculadoraService();
    }

    @Test
    public void somarDoisValores() {

        int a = 10;
        int b = 5;

        calculadora = new CalculadoraService();

        int resultado = calculadora.somar(a, b);

        Assert.assertEquals(15,resultado);

    }
}
