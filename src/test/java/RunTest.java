import example.AssertTest;
import example.CalculadoraMockTest;
import org.junit.runners.Suite;
import services.CalculadoraTest;

@Suite.SuiteClasses({
        CalculadoraTest.class,
        AssertTest.class,
        CalculadoraMockTest.class
        })
public class RunTest {
}
