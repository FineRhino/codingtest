public class Amortization {

    public double calcMonthlyPayment(double loanAmount, double interestRate, int numPayments){
        double monthlyPayment = 0;
        monthlyPayment = (loanAmount *
                (interestRate * (Math.pow(1 + interestRate, numPayments))))
                / ((Math.pow(1 + interestRate, numPayments)) - 1);
        return monthlyPayment;
    }

    public double calcPrincipalPaymentForPayPeriod(double loanAmount, double interestRate, int numPayment, int payPeriod){
        double principalPayment = 0;
        return principalPayment;
    }

    public double calcInterestPaymentForPayPeriod(double loanAmount, double interestRate, int numPayment, int payPeriod){
        double interestPayment = 0;
        return interestPayment;
    }

    public double calcBalanceAsOfPayPeriod(double loanAmount, double interestRate, int numPayment, int payPeriod){
        double balance = 0;
        return balance;
    }

}
