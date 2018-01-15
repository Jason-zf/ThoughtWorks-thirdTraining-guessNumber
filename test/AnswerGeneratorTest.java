import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswerGeneratorTest {

    @Test
    public void shouldReturnValidWhenGenerator(){
        AnswerGenerator answerGenerator=new AnswerGenerator();
        String result=answerGenerator.generate();
        assertThat(result,is("1"));
    }
}

