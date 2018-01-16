import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AnswerGeneratorTest {

    @Test
    public void shouldReturnNotEmptyWhenGenerateAnswer() {
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String result = answerGenerator.generate();
        assertThat(result, notNullValue());
    }

    @Test
    public void sholdReturnFourWhenGenerateAnswer() {
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String result = answerGenerator.generate();
        int num = result.length();
        assertThat(result.length(), is(4));
    }

    @Test
    public void sholdReturnFourNumWhenGenerateAnswer() {
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String result = answerGenerator.generate();
        int num=Integer.valueOf(result).intValue();
        assertTrue(num>=1000&&num<=9999);
    }

    @Test
    public void sholdReturnDifferentWhenGenerateAnswer(){
        AnswerGenerator answerGenerator=new AnswerGenerator();
        String result=answerGenerator.generate();
        for(int i=0;i<result.length();++i){
            for(int j=i+1;j<result.length();++j)
            {
                assertFalse(result.substring(i,i+1).equals(result.substring(j,j+1)));
            }
        }
    }
}
