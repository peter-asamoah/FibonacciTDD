import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fibonacciTest {
fibonacci fibi = new fibonacci();

    @Test
    public void testifgreaterthanzero(){
      assertThrows(IllegalArgumentException.class,() -> fibi.fib(-21));
    }

    @Test
    public void testzone(){
       int y= fibi.fib(1);
        assertEquals(y,0);

    }
    @Test
    public void testtwo(){
        int y= fibi.fib(2);
        assertEquals(y,1);

    }


    @Test
    public void testthree(){
        int y= fibi.fib(5);
        assertEquals(3,y);

    }

}