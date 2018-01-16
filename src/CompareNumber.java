public class CompareNumber {
    public String compare(String answerStr, String guessStr) {
        if (answerStr.equals(guessStr))
            return "4A0B";
        int numOfA = 0, numOfB = 0;
        for (int i = 0; i < answerStr.length(); ++i) {
            String subAnswer = answerStr.substring(i, i + 1);
            String subGuess = guessStr.substring(i, i + 1);
            if (subAnswer.equals(subGuess)) {
                ++numOfA;
                continue;
            }
            if (guessStr.contains(subAnswer))
                ++numOfB;
        }
        String res = String.valueOf(numOfA) + "A" + String.valueOf(numOfB) + "B";
        return res;
    }
}

