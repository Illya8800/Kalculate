package Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqualTest {

    @Test
    public void plus() {

        double inputNumberOne = 5.4;
        double inputNumberTwo = -2_345.5_45643;

        System.out.println(inputNumberOne + inputNumberTwo);
    }

    @Test
    public void minus() {

        double inputNumberOne = -4324.0;
        double inputNumberTwo = -4643.325;

        System.out.println(inputNumberOne - inputNumberTwo);
    }

    @Test
    public void division() {

        double inputNumberOne = 3.0;
        double inputNumberTwo = -45643.468;

        System.out.println(inputNumberOne / inputNumberTwo);
    }

    @Test
    public void multiple() {

        double inputNumberOne = 2.4;
        double inputNumberTwo = 65.6;

        System.out.println(inputNumberOne * inputNumberTwo);
    }
}