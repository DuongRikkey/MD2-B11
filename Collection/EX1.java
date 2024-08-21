package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EX1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        int NumberOfelements = rand.nextInt(10) + 1;

        for (int i = 0; i < NumberOfelements; i++) {

            list.add(rand.nextInt(10) + 1);
            System.out.println(list.get(i));

        }
        System.out.println("Max là"+ Collections.max(list));
        Collections.reverse(list);
        System.out.println("Đảo ngược mảng");
        System.out.println(list);
        System.out.println("Sắp xếp mảng");
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list);
        System.out.println("Mảng list2"+list2);
    }

}
