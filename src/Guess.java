public class Guess {
    static String _answerStr = AnswerGenerator.generate();
    public String run(String guessStr) {
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(_answerStr, guessStr);
        return result;
    }
}
