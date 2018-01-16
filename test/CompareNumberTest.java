import org.junit.Test;

import java.util.zip.CheckedOutputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class CompareNumberTest {

    @Test
    public void shouldReturnNotEmptyWhenInputTwoParam() {
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234", "1234");
        assertThat(result, notNullValue());
    }

    @Test
    public void shouldReturnCorrectFormatWhenInputTwoNumbers() {
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234", "1234");
        int num = Integer.valueOf(result.substring(0, 1));
        assertTrue(num >= 0 && num <= 4);
        assertThat(result.charAt(1), is('A'));
        assertThat(result.charAt(3), is('B'));
        num = Integer.valueOf(result.substring(2, 3));
        assertTrue(num >= 0 && num <= 4);
    }

    @Test
    public void sholdReturn4A0BWhenInputSameParam() {
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234", "1234");
        assertThat(result, is("4A0B"));
    }

    @Test
    public void sholdReturn0A4BWhenInputSameNumNotSamePosition(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234", "4321");
        assertThat(result, is("0A4B"));
    }

    @Test
    public void sholdReturnCorrectxAxBWhenInputTwoParams(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234", "1435");
        assertThat(result, is("2A1B"));
    }
}
