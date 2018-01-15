import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {
    /*生成随机数的个数*/
    final int _numOfAnswer=4;

    public String generate() {
        Random r=new Random();
        int num;
        List list=new ArrayList();
        boolean flag=true;
        while (flag){
            num=r.nextInt(10);
            if(!list.contains(num))
                list.add(num);
            if(list.size()==_numOfAnswer)
                flag=false;
        }
        String res=list.toString();
        return res;
    }
}
