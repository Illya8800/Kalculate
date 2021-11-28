package Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void operation() {

        double inputNumber = 43.0;
        double m = 1;
        while (inputNumber > 1){
            m = m * inputNumber;
            inputNumber--;
        }

        System.out.println(m);
    }
}