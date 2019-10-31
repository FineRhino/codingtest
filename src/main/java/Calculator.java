public class Calculator {

    public double add(double[] nums) {
        double sum = 0;
        for (int i=0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        return sum;
    }

    public double subtract(double a, double b) {
        double total = a-b;
        return total;
    }

    public double multiply(double[] nums) {
        double product = 1;
        for (int i=0; i < nums.length; i++){
            product = product * nums[i];
        }
        return product;
    }

    public double divide(double dividend, double divisor){
        double quotient = dividend/divisor;
        return quotient;
    }

    public double mean(double[] nums) {
        double mean = 0;
        double sum  = 0;
        int n = nums.length;
        for (int i=0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        mean = sum/n;
        return mean;
    }

}
