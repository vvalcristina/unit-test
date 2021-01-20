package example;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void testeAsserts(){

        //Recebe como parâmetro um booleano
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        /**
         * Checa se um valor é igual a outro
         *
         * Ideal para trabalhar com int, long, char, short, boolean
         *
         * Se comporta diferente com Float e Double devido as casas decimais
         *
         */

        Assert.assertEquals(1,1);
        Assert.assertEquals(0.51236,0.51,0.01);
        Assert.assertEquals(Math.PI, 3.14, 0.01);

        //Pode-se declarar uma String caso haja erro no teste
        Assert.assertEquals("Erro de comparação", 1,1);

        //Strings
        Assert.assertEquals("bola", "bola");
        Assert.assertNotEquals("bola", "casa");
        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));

    }
}
