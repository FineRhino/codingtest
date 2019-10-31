import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestReturnLargestNumberInUnorderedArray {

    @Test
    public void returnLargestNumberInUnorderedArray() {
        long numbers[] = new long[4];
        numbers[0] = 12L;
        numbers[1] = 3L;
        numbers[2] = 9000L;
        numbers[3] = 1L;
        ReturnLargestNumberInUnorderedArray  rlniua = new ReturnLargestNumberInUnorderedArray();

        //assertions
        assertEquals(9000, rlniua.returnLargestNumberinUnorderedArray(numbers));
    }

    @Test
    public void returnZeroInEmptyUnorderedArray() {
        long numbers[] = new long[0];
        ReturnLargestNumberInUnorderedArray  rlniua = new ReturnLargestNumberInUnorderedArray();

        //assertions
        assertEquals(0, rlniua.returnLargestNumberinUnorderedArray(numbers));
    }
}
