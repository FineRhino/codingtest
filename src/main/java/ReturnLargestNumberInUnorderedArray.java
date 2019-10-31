
/*
    Test
    Implement a function that will accept an unordered array of long types of varying lengths and return the largest number.
    If the array is empty, then return zero.

 */
public class ReturnLargestNumberInUnorderedArray {

    public static void main (String[] args){
        long numbers[] = new long[4];
        numbers[0] = 12L;
        numbers[1] = 3L;
        numbers[2] = 9000L;
        numbers[3] = 1L;

        long finalNumber = returnLargestNumberinUnorderedArray(numbers);
        System.out.println("Final Number is " + finalNumber);

        long numbersTwo[] = new long[0];
        long finalNumberTwo = returnLargestNumberinUnorderedArray(numbersTwo);
        System.out.println("Final Number is " + finalNumberTwo);
    }

    public static long returnLargestNumberinUnorderedArray(long[] numbers) {
        long largestNumber = 0L;
        long oldNumber = 0L;
        long newNumber = 0L;
        if (numbers.length == 0) {
            largestNumber = 0;
        }
        else {
            for (int i=0;i<numbers.length;i++) {
                if (i == 0) {
                    oldNumber = numbers[i];
                    newNumber = numbers[i];
                    largestNumber = numbers[i];
                } else {
                    newNumber = numbers[i];
                    if (newNumber > oldNumber) {
                        largestNumber = numbers[i];
                    }
                    oldNumber = newNumber;
                }
            }
        }
        return largestNumber;
    }
}
