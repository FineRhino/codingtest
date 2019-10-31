import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAnagram {

    @Test
    public void testAnagramWithSampleSentence(){
        String str = "This is an anagram";
        Anagram a = new Anagram();

        //assertions
        assertEquals("margana na si sihT", a.createAnagram(str));
    }
}
