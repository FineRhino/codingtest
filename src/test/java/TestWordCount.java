import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestWordCount {

    @Test
    public void testWordCountWithSampleSentence(){
        String str = "This is my sample sentence to test my word count routine";
        WordCount wc = new WordCount();

        //assertions
        assertEquals(11, wc.countWords(str));
    }

    @Test
    public void testWordCountWithZeroWords(){
        String str = "";
        WordCount wc = new WordCount();

        //assertions
        assertEquals(0, wc.countWords(str));
    }

    @Test
    public void testWordCountWithASentenceWithColon(){
        String str = "The list is: beer, soda, and wine";
        WordCount wc = new WordCount();

        //assertions
        assertEquals(7, wc.countWords(str));
    }
}
