package Collection;

import java.util.ArrayList;
import java.util.List;

public class EX2 {
    public static void main(String[] args) {
        String sentence="Rikkei Academy để nông dân biết code";
        List<String> words=new ArrayList<String>();
        String[] wordsArray=sentence.split(" ");
        for (int i = 0; i <wordsArray.length; i++) {
            words.add(wordsArray[i]);
        }
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).length()>3){
                System.out.println(words.get(i));
            }
        }
    }
}
