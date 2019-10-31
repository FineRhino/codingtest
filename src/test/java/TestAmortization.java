import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAmortization {

    @Test
    public void testAdd() {
        double loanAmount   = 20000;
        double interestRate = .00625;
        int numPayments     = 60;

        Amortization a = new Amortization();

        //assertions
        assertEquals(400.76, a.calcMonthlyPayment(loanAmount, interestRate, numPayments), .01);   //expected, actual, epsilon (acceptable variance)
    }
}