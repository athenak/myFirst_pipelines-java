import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
    }
    
    @Test
    public void test_method3() { 
       Demo d2 = new Demo();
        d.DoSomething(true);
        String expected = ""I am covered"";
        String actual = ""I am covered"";

        assertEquals(expected, actual);
     }
}
