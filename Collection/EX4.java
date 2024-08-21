package Collection;

import java.util.ArrayList;

public class EX4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(7);
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)>list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }


        }
        System.out.println(list);
    }
}
