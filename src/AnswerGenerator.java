import java.util.Random;

public class AnswerGenerator {
    final static int MAX_NUM_OF_ANSWER = 4;

    public static String generate() {
        Random r = new Random();
        int num;
        String res = "";
        boolean flag = true;
        while (flag) {
            num = r.nextInt(10);
            String s = String.valueOf(num);
            if (!res.contains(s))
                res += s;
            if (res.length() == MAX_NUM_OF_ANSWER)
                flag = false;
        }
        return res;
    }
}
