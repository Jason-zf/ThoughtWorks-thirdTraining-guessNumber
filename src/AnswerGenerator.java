import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {
    /*生成随机数的个数*/
    final int _numOfAnswer=4;

    public String generate() {
        Random r=new Random();
        int num;
        String res="";
        boolean flag=true;
        while (flag){
            num=r.nextInt(10);
            String s=String.valueOf(num);
            if(!res.contains(s))
                res+=s;
            if(res.length()==_numOfAnswer)
                flag=false;
        }
        return res;
    }
}
