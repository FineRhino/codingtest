import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        TestAnagram.class,
        TestCalculator.class,
        TestReturnLargestNumberInUnorderedArray.class,
        TestWordCount.class,
        TestAmortization.class})
public class ProjectTestSuite {
    // code relevant to test suite goes here
}