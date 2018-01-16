import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class GuessTest {

    @Test
    public void shouldReturnNotEmptyWhenPlayerInput(){
        Guess guess = new Guess();
        String result = guess.run("1234");
        assertThat(result,notNullValue());
    }

    @Test
    public void shouldReturnxAxBWhenPlayerInput() {
        Guess guess = new Guess();
        String result = guess.run("1234");
        result = guess.run("1234");
        int num = Integer.valueOf(result.substring(0, 1));
        assertTrue(num >= 0 && num <= 4);
        assertThat(result.charAt(1), is('A'));
        assertThat(result.charAt(3), is('B'));
        num = Integer.valueOf(result.substring(2, 3));
        assertTrue(num >= 0 && num <= 4);
    }
}
