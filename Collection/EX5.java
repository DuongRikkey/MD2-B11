package Collection;

import java.util.ArrayList;

public class EX5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        ArrayList<Integer> listOdd = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                listOdd.add(list.get(i));
            }
        }
        System.out.println(listOdd);
    }
}
