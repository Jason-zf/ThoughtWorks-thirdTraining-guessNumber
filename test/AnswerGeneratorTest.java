import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswerGeneratorTest {

    @Test
    public void shouldReturnNotEmptyWhenGenerateAnswer(){
        AnswerGenerator answerGenerator=new AnswerGenerator();
        String result=answerGenerator.generate();
        assertThat(result,notNullValue());
    }
}
