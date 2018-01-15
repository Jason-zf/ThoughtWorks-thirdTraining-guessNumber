import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareNumberTest {

    @Test
    public void shouldReturnxAxBWhenInputTwoNumbers() {
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234", "1234");
        assertThat(result, is("1"));
    }
}
