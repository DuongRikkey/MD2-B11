package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EX3 {
    public static void main(String[] args) {
        String sentence="Duong dep trai nhat the gioi";
        ArrayList<String> list = new ArrayList<String>();
        String[] words = sentence.split(" ");
        for(int i=0; i<words.length; i++){
            list.add(words[i]);

        }
        ArrayList<String> newList = new ArrayList<String>();
        System.out.println(list);
        int minLength =Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).length()<minLength){
                newList.clear();
                minLength = list.get(i).length();
                newList.add(list.get(i));

            }else if(list.get(i).length()==minLength){
                newList.add(list.get(i));
            }

        }
       for(int i=0; i<newList.size(); i++){
           System.out.println(newList.get(i));
       }



    }
}
