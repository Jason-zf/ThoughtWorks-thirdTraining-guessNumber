import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class main {
    final static int MAX_NUM_OF_INPUT = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
        System.out.println("Welcome\n");
        String res;
        boolean isGuessCorrect=false;
        for (int i = 0; i < MAX_NUM_OF_INPUT; ++i) {
            String tips="Please input your number("+String.valueOf(MAX_NUM_OF_INPUT-i)+"):";
            System.out.println(tips);
            String inputStr = scanner.next();
            if(containRepeatCharacter(inputStr)==true)
            {
                System.out.println("Cannot input duplicate numbers!");
                --i;
                continue;
            }
            res= guess.run(inputStr);
            if(res=="4A0B")
                isGuessCorrect=true;
            if(i!=MAX_NUM_OF_INPUT-1)
                System.out.println(res);
        }
        if(isGuessCorrect)
            System.out.println("Congratulations!");
        else
            System.out.println("Game Over");
        System.out.close();
    }

    public static boolean containRepeatCharacter(String inputStr){
        if (inputStr.isEmpty())
            return false;
        for (int i=0;i<inputStr.length();++i)
            if(inputStr.indexOf(inputStr.charAt(i))!=inputStr.lastIndexOf(inputStr.charAt(i)))
                return true;
        return false;
    }
}
