import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testAdd(){
        double[] nums = new double[4];
        nums[0] = 1.02;
        nums[1] = 3.05;
        nums[2] = 4.98;
        nums[3] = 0.08;

        Calculator c = new Calculator();

        //assertions
        assertEquals(9.13, c.add(nums), .01);   //expected, actual, epsilon (acceptable variance)
    }

    @Test
    public void testMultiply(){
        double[] nums = new double[4];
        nums[0] = 1.02;
        nums[1] = 3.05;
        nums[2] = 4.98;
        nums[3] = 0.08;

        Calculator c = new Calculator();

        //assertions
        assertEquals(1.24, c.multiply(nums), .01);   //expected, actual, epsilon (acceptable variance)
    }

    @Test
    public void testDivide(){
        double dividend = 8.19;
        double divisor = 4.21;

        Calculator c = new Calculator();

        //assertions
        assertEquals(1.94, c.divide(dividend, divisor), .01);   //expected, actual, epsilon (acceptable variance)
    }

    @Test
    public void testSubtract(){
        double a = 8.19;
        double b = 4.21;

        Calculator c = new Calculator();

        //assertions
        assertEquals(3.98, c.subtract(a, b), .01);   //expected, actual, epsilon (acceptable variance)
    }

    @Test
    public void testAverage(){
        double[] nums = {8.19, 3.98, 11.52, -1.06, 12.97, 15};
        Calculator c = new Calculator();

        //assertions
        assertEquals(8.43, c.mean(nums), .01);   //expected, actual, epsilon (acceptable variance)
    }
}
