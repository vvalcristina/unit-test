package example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import services.CalculadoraService;

public class CalculadoraMockTest {

    @Mock
    private CalculadoraService calculadoraMock;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void somarDoisValores(){
        CalculadoraService calculadoraMock = Mockito.mock(CalculadoraService.class);
        ArgumentCaptor<Integer> argCapt = ArgumentCaptor.forClass(Integer.class);
        Mockito.when(calculadoraMock.somar(argCapt.capture(), argCapt.capture())).thenReturn(15);
        Assert.assertEquals(15, calculadoraMock.somar(1,10000));
    }

}
