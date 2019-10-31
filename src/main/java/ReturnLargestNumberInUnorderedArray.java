
/*
    Test
    Implement a function that will accept an unordered array of long types of varying lengths and return the largest number.
    If the array is empty, then return zero.

 */
public class ReturnLargestNumberInUnorderedArray {

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
