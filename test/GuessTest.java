import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GuessTest {

    @Test
    public void shouldReturnxAxBWhenPlayerInputNumber(){
        Guess guess=new Guess();
        String result=guess.run("1234");
        assertThat(result,is("4A0B"));
    }
}
